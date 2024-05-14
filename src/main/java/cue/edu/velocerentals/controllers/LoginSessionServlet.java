package cue.edu.velocerentals.controllers;

import cue.edu.velocerentals.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/login")
public class LoginSessionServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect(req.getContextPath() + "/login.html");
        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Lo sentimos no esta autorizado para ingresar a esta página!");
        }
    }
}

    //@Override
    //protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            //ServletException, IOException {
       // LoginService auth;
        //auth = (LoginService) new LoginServiceSessionImpl();
        //Optional<String> usernameOptional = auth.getUsername(req);
        //if (usernameOptional.isPresent()) {
          //  resp.setContentType("text/html;charset=UTF-8");
            //try (PrintWriter out = resp.getWriter()) {

            //}
        //} else {
          //  getServletContext().getRequestDispatcher("/login.jsp").forward(req,
            //        resp);
        //}
    //}
//}