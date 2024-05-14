-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-05-2024 a las 18:36:00
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alquilervehiculos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `email`, `password`) VALUES
(1, 'Juan Pérez', 'user1@example.com', 'password123'),
(2, 'María López', 'user2@example.com', 'securepass'),
(3, 'Carlos González', 'user3@example.com', 'qwerty'),
(4, 'Laura Martínez', 'user4@example.com', 'securepassword'),
(5, 'Pedro Sánchez', 'user5@example.com', 'mypassword123'),
(6, 'Ana Gómez', 'user6@example.com', 'pass1234'),
(7, 'Sofía Rodríguez', 'user7@example.com', 'abc123'),
(8, 'Miguel López', 'user8@example.com', 'password456'),
(9, 'Lucía García', 'user9@example.com', 'test123'),
(10, 'David Ruiz', 'user10@example.com', 'mysecurepass'),
(11, 'Elena Pérez', 'user11@example.com', 'qwerty123'),
(12, 'Javier González', 'user12@example.com', 'securepass321'),
(13, 'Carmen Fernández', 'user13@example.com', 'password789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `id` int(11) NOT NULL,
  `category` varchar(50) DEFAULT NULL,
  `price` decimal(10,0) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `available` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`id`, `category`, `price`, `type`, `available`) VALUES
(1, 'Car', 50, 'Sedan', 1),
(2, 'Car', 70, 'SUV', 1),
(3, 'Motorcycle', 40, 'Sport', 1),
(4, 'Motorcycle', 45, 'Cruiser', 0),
(5, 'Car', 45, 'Hatchback', 0),
(6, 'Car', 60, 'Convertible', 1),
(7, 'Motorcycle', 50, 'Touring', 1),
(8, 'Car', 80, 'Truck', 0),
(9, 'Motorcycle', 55, 'Off-road', 0),
(10, 'Car', 65, 'Coupe', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
