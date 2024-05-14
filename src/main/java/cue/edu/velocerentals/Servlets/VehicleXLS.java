package cue.edu.velocerentals.Servlets;

import cue.edu.velocerentals.mapping.mappers.Dtos.VehiclesDto;
import cue.edu.velocerentals.service.VehicleServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.StringCharacterIterator;
import java.util.List;

@WebServlet({"/vehicles.xls", "/vehicles.html", "/vehicles"})

public class VehicleXLS extends HttpServlet {

    private static VehicleServiceImpl service;

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        List<VehiclesDto> vehiclesDtos = null;
        try {
            vehiclesDtos = service.listVehicles();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        response.setContentType("text/html;charset=UTF-8");
        String servletPath = request.getServletPath();
        boolean esXls = servletPath.endsWith(".xls");
        if (esXls){
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment;filename=student.xls");
        }
        try (PrintWriter out = response.getWriter()) {
            if(!esXls) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Vehicles List</title>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Vehicles List!</h1>");
                out.println("<p><a href=\"" + request.getContextPath() + "/vehicles.xls" + "\">exportar a xls</a></p>");

            }
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>id</th>");
            out.println("<th>Category</th>");
            out.println("<th>type</th>");
            out.println("<th>price</th>");
            out.println("</tr>");
            vehiclesDtos.forEach(p ->{
                out.println("<tr>");
                out.println("<td>" + p.id() + "</td>");
                out.println("<td>" + p.category() + "</td>");
                out.println("<td>" + p.type() + "</td>");
                out.println("<td>" + p.available() + "</td>");
                out.println("</tr>");
            });
            out.println("</table>");
            if(!esXls) {
                out.println(" </body>");
                out.println("</html>");
            }
        }
    }

}
