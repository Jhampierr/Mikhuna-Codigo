-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 15-07-2019 a las 19:48:33
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `mikhuna`
--
CREATE DATABASE IF NOT EXISTS `mikhuna` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `mikhuna`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE IF NOT EXISTS `alimento` (
  `cod_alimento` varchar(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `ultima_edicion` date NOT NULL,
  `tipo_alimento` varchar(16) NOT NULL,
  PRIMARY KEY (`cod_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`cod_alimento`, `nombre`, `precio`, `ultima_edicion`, `tipo_alimento`) VALUES
('ALM01', 'Papa a la huancaina ++', 100, '2019-07-15', 'nosey nose');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cod_cliente` varchar(10) NOT NULL,
  `nombres` varchar(200) NOT NULL,
  `documento` varchar(15) NOT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cod_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE IF NOT EXISTS `detalle_pedido` (
  `id_detalle_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `total` double NOT NULL,
  `fecha_hora_cocinado` datetime DEFAULT NULL,
  `cod_pedido` varchar(20) NOT NULL,
  `cod_alimento` varchar(10) NOT NULL,
  PRIMARY KEY (`id_detalle_pedido`),
  KEY `pedido_det_fk6` (`cod_pedido`),
  KEY `det_alimento_fk7` (`cod_alimento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `cod_empleado` varchar(10) NOT NULL,
  `nombres` varchar(200) DEFAULT NULL,
  `documento` varchar(10) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(128) DEFAULT NULL,
  `clave` varchar(20) DEFAULT NULL,
  `fecha_vinculacion` date NOT NULL,
  `tipo_empleado` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cod_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`cod_empleado`, `nombres`, `documento`, `telefono`, `direccion`, `clave`, `fecha_vinculacion`, `tipo_empleado`) VALUES
('EMP010', 'Pepito', '71589632', '987456321', 'jr clave', 'Pepe', '2019-07-13', 'ADMINISTRADOR'),
('EMP050', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP051', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP052', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP053', 'Ismael', 'Cieza', 'Delgado', 'Cieza', 'Ismael', '2019-07-15', 'COCINERO'),
('EMP50', '', '', '', '', '', '2019-07-15', 'ADMINISTRADOR'),
('EMP51', 'Jairo', '7854963', '78545', '7854963', 'Jairo', '2019-07-15', 'CAJERO'),
('EMP60', 'Jairo', '71698922', '741258', 'sdfsdf', 'sdfsdfs', '2019-07-15', 'MOZO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `cod_factura` varchar(18) NOT NULL,
  `subtotal` double NOT NULL,
  `igv` double NOT NULL,
  `pago_final` double NOT NULL,
  `cod_pedido` varchar(20) NOT NULL,
  PRIMARY KEY (`cod_factura`),
  KEY `fact_pedido_fk8` (`cod_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE IF NOT EXISTS `mesa` (
  `cod_mesa` varchar(4) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `ubicacion` varchar(20) NOT NULL,
  PRIMARY KEY (`cod_mesa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `cod_pedido` varchar(20) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `estado` varchar(16) DEFAULT NULL,
  `cod_empleado` varchar(10) DEFAULT NULL,
  `cod_cliente` varchar(10) DEFAULT NULL,
  `cod_mesa` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`cod_pedido`),
  KEY `pedido_cliente_fk3` (`cod_cliente`),
  KEY `pedido_empleado_fk4` (`cod_empleado`),
  KEY `pedido_mesa_fk5` (`cod_mesa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_cobro`
--

CREATE TABLE IF NOT EXISTS `tipo_cobro` (
  `id_cobro` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_cobro` varchar(10) NOT NULL,
  `cant_cobro` double NOT NULL,
  `saldo` double NOT NULL,
  `cod_factura` varchar(18) NOT NULL,
  PRIMARY KEY (`id_cobro`),
  KEY `cobro_fact_fk9` (`cod_factura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD CONSTRAINT `det_alimento_fk7` FOREIGN KEY (`cod_alimento`) REFERENCES `alimento` (`cod_alimento`),
  ADD CONSTRAINT `pedido_det_fk6` FOREIGN KEY (`cod_pedido`) REFERENCES `pedido` (`cod_pedido`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fact_pedido_fk8` FOREIGN KEY (`cod_pedido`) REFERENCES `pedido` (`cod_pedido`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_cliente_fk3` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`cod_cliente`),
  ADD CONSTRAINT `pedido_empleado_fk4` FOREIGN KEY (`cod_empleado`) REFERENCES `empleado` (`cod_empleado`),
  ADD CONSTRAINT `pedido_mesa_fk5` FOREIGN KEY (`cod_mesa`) REFERENCES `mesa` (`cod_mesa`);

--
-- Filtros para la tabla `tipo_cobro`
--
ALTER TABLE `tipo_cobro`
  ADD CONSTRAINT `cobro_fact_fk9` FOREIGN KEY (`cod_factura`) REFERENCES `factura` (`cod_factura`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
