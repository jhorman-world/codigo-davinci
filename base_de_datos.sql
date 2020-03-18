-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-01-2020 a las 14:48:08
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_de_datos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_usuario` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `AP_paterno` varchar(20) NOT NULL,
  `AP_materno` varchar(20) NOT NULL,
  `DNI` varchar(8) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `ID_rol` varchar(11) NOT NULL,
  `estado` char(20) NOT NULL,
  `Fecha_registro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_usuario`, `Nombre`, `AP_paterno`, `AP_materno`, `DNI`, `Password`, `Usuario`, `ID_rol`, `estado`, `Fecha_registro`) VALUES
(1, 'jhorman', 'quispe', 'acuña', '70099237', 'admin123', 'Jquispe', 'administrad', 'activo', '2020-01-23'),
(2, 'jhair', 'flores', 'leon', '40858023', 'jhair123', 'Jflores', 'usuario', 'activo', '2020-01-21'),
(4, 'wefwef', 'wefwfw', 'wefwef', '', 'sdvfd', 'jhbjh', 'Secretaria', 'Activo', '2020-01-25'),
(5, 'wefwef', 'wefwfw', 'wefwef', '70099237', 'sdvfd', 'jhbjh', 'Secretaria', 'Activo', '2020-01-25'),
(6, 'wefwef', 'wefwfw', 'wefwef', '12345678', 'sdvfd', 'jhbjh', 'Secretaria', 'Activo', '2020-01-17'),
(7, 'ayovi', 'quispe', 'acuña', '70099237', 'entrar123', 'jhbjh', 'Ingeniero', 'Activo', '2020-01-27'),
(8, 'PERCY', 'BERROCAL', 'FLORES', '44334433', '789456', 'PBERROCAL', 'Ingeniero', 'Activo', '2020-01-27'),
(9, 'CARLOS', 'GUTIERREZ', 'CARDENAS', '78945612', '123', 'CGUTIERREZ', 'Ingeniero', 'Activo', '2020-01-29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
