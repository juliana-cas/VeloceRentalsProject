package cue.edu.velocerentals.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

        public void doPost(@NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Recuperar los parámetros del formulario de registro
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // Verificar si los campos obligatorios no están vacíos
            if (username == null || username.isEmpty() || email == null || email.isEmpty() || password == null || password.isEmpty()) {
                // Si algún campo está vacío, redirigir de vuelta al formulario de registro con un mensaje de error
                response.sendRedirect("registro.jsp?error=Campos obligatorios incompletos");
                return;
            }

            // Aquí podrías agregar más validaciones, como verificar el formato del correo electrónico, la fortaleza de la contraseña, etc.

            // Luego, puedes guardar el usuario en la base de datos, por ejemplo:
            // userService.registrarUsuario(username, email, password);

            // Redireccionar a una página de éxito o mostrar un mensaje de éxito
            response.sendRedirect("registro_exitoso.jsp");
        }
    }
