package cue.edu.velocerentals.service;

import cue.edu.velocerentals.models.User;

import java.util.List;

public interface UserService{

        // Método para registrar un nuevo usuario
        boolean registrarUsuario(String username, String email, String password);

        // Método para autenticar a un usuario
        boolean autenticarUsuario(String email, String password);

        // Método para obtener un usuario por su ID
        User obtenerUsuarioPorId(int id);

        // Método para obtener un usuario por su nombre de usuario
        User obtenerUsuarioPorUsername(String username);

        // Método para obtener un usuario por su correo electrónico
        User obtenerUsuarioPorEmail(String email);

        // Método para actualizar los datos de un usuario
        boolean actualizarUsuario(User usuario);

        // Método para eliminar un usuario
        boolean eliminarUsuario(int id);

        // Método para obtener todos los usuarios
        List<User> obtenerTodosLosUsuarios();


}
