# modelos_comunicaciones
Librería con clases de utilidad para las comunicaciones web

Depende de:
https://github.com/EAG-es/modelos

Base de datos MySQL utilizada por la clase de pruebas: cliente_jdbc_servidor_httpsTest

-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-03-2023 a las 13:02:52
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `personas`
--
CREATE DATABASE IF NOT EXISTS `personas` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `personas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `id_persona` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `sexo` enum('XY','XX','..','') COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_numero` int(11) NOT NULL,
  `direccion_parte_extra_numero` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_piso` int(11) NOT NULL,
  `direccion_puerta` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_parte_extra_puerta` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ciudad` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `codigo_postal` int(11) NOT NULL,
  `provincia_o_estado` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `contraseña` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_inicio_validez` datetime NOT NULL,
  `comentarios` text COLLATE utf8_spanish_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas_personas`
--

CREATE TABLE `personas_personas` (
  `ref_persona_origen` int(11) NOT NULL,
  `ref_persona_destino` int(11) NOT NULL,
  `tipo_de_relacion` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indices de la tabla `personas_personas`
--
ALTER TABLE `personas_personas`
  ADD PRIMARY KEY (`ref_persona_origen`,`ref_persona_destino`),
  ADD KEY `i_persona_origen` (`ref_persona_origen`) USING BTREE,
  ADD KEY `i_persona_destino` (`ref_persona_destino`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id_persona` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personas_personas`
--
ALTER TABLE `personas_personas`
  ADD CONSTRAINT `fk_persona_destino` FOREIGN KEY (`ref_persona_destino`) REFERENCES `personas` (`id_persona`),
  ADD CONSTRAINT `fk_persona_origen` FOREIGN KEY (`ref_persona_origen`) REFERENCES `personas` (`id_persona`);
COMMIT;
