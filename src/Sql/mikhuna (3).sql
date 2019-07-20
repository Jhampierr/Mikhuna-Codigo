-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-07-2019 a las 21:39:25
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mikhuna`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `cod_alimento` varchar(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `ultima_edicion` date NOT NULL,
  `tipo_alimento` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`cod_alimento`, `nombre`, `precio`, `ultima_edicion`, `tipo_alimento`) VALUES
('ALM0001', 'CAFE', 1.5, '2019-07-16', 'BEBIDA'),
('ALM01', 'Limonada', 6, '2019-07-16', 'BEBIDA'),
('ALM11', 'Ceviche', 5, '2019-07-15', 'ENTRADA'),
('ALM12', 'Huancaina', 5.2, '2019-07-15', 'ENTRADA'),
('ALM8', 'Papa A la Huancaina', 5, '2019-07-15', 'ENTRADA'),
('EMP15', 'arroz chaufa', 5, '2019-07-15', 'SEGUNDO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cod_cliente` varchar(10) NOT NULL,
  `nombres` varchar(200) NOT NULL,
  `documento` varchar(15) NOT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cliente`, `nombres`, `documento`, `telefono`, `direccion`) VALUES
('', '', '', '', ''),
('CLI01', 'Ismael Cieza', '78965412', '789456132', 'Av el sol'),
('CLI02', 'jairo', '71698923', '123456789', 'Av el sol 306'),
('EMP03', 'Jairo CIeza', '78965413', '937801901', 'AV SAN JUAN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_pedido`
--

CREATE TABLE `detalle_pedido` (
  `id_detalle_pedido` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `cod_pedido` varchar(20) DEFAULT NULL,
  `cod_alimento` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_pedido`
--

INSERT INTO `detalle_pedido` (`id_detalle_pedido`, `cantidad`, `total`, `cod_pedido`, `cod_alimento`) VALUES
(7, 1, 5, 'P001', 'ALM01'),
(8, 1, 5, 'P001', 'ALM01'),
(9, 1, 5, 'P001', 'ALM01'),
(17, NULL, NULL, 'P005', NULL),
(20, NULL, NULL, 'P006', NULL),
(21, NULL, NULL, 'P007', NULL),
(22, NULL, NULL, 'P008', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `cod_empleado` varchar(10) NOT NULL,
  `nombres` varchar(200) DEFAULT NULL,
  `documento` varchar(10) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(128) DEFAULT NULL,
  `clave` varchar(20) DEFAULT NULL,
  `fecha_vinculacion` date NOT NULL,
  `tipo_empleado` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`cod_empleado`, `nombres`, `documento`, `telefono`, `direccion`, `clave`, `fecha_vinculacion`, `tipo_empleado`) VALUES
('', '', '', '', '', '', '2019-07-19', 'ADMINISTRADOR'),
('EMP010', '', '', '', '', '', '2019-07-13', 'ADMINISTRADOR'),
('EMP050', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP051', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP052', 'Jairo', 'Cieza', 'Delgado', 'Cieza', 'Jairo', '2019-07-15', 'COCINERO'),
('EMP053', 'Ismael', 'Cieza', 'Delgado', 'Cieza', 'Ismael', '2019-07-15', 'COCINERO'),
('EMP200', '', '', '', '', '', '2019-07-19', 'ADMINISTRADOR'),
('EMP201', '', '', '', '', NULL, '2019-07-19', 'ADMINISTRADOR'),
('EMP50', '', '', '', '', '', '2019-07-15', 'ADMINISTRADOR'),
('EMP51', 'Jairo', '7854963', '78545', '7854963', 'Jairo', '2019-07-15', 'CAJERO'),
('EMP60', 'Jairo', '71698922', '741258', 'sdfsdf', 'sdfsdfs', '2019-07-15', 'MOZO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `cod_factura` varchar(18) NOT NULL,
  `subtotal` double NOT NULL,
  `igv` double NOT NULL,
  `pago_final` double NOT NULL,
  `cod_pedido` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`cod_factura`, `subtotal`, `igv`, `pago_final`, `cod_pedido`) VALUES
('F0000001', 50, 5, 150, 'P001'),
('F0000004', 0, 0, 0, 'P005'),
('F0000005', 0, 0, 0, 'P006'),
('F0000006', 0, 0, 0, 'P007'),
('F0000007', 0, 0, 0, 'P008'),
('F000003', 0, 0, 0, 'P004'),
('F0003', 0, 0, 0, 'P003');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medio_pago`
--

CREATE TABLE `medio_pago` (
  `id_cobro` int(11) NOT NULL,
  `tipo_cobro` varchar(10) NOT NULL,
  `cant_cobro` double NOT NULL,
  `cod_factura` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `cod_mesa` varchar(4) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `ubicacion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`cod_mesa`, `descripcion`, `capacidad`, `ubicacion`) VALUES
('M001', 'Mesa 1', 10, 'PISO 1'),
('M002', 'Mesa 2', 10, 'PISO 1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `cod_pedido` varchar(20) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `estado` varchar(16) DEFAULT NULL,
  `cod_empleado` varchar(10) DEFAULT NULL,
  `cod_cliente` varchar(10) DEFAULT NULL,
  `cod_mesa` varchar(4) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_hora_c` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`cod_pedido`, `fecha_hora`, `estado`, `cod_empleado`, `cod_cliente`, `cod_mesa`, `direccion`, `fecha_hora_c`) VALUES
('P001', '2019-07-18 18:17:00', 'PENDIENTE', 'EMP051', 'CLI01', 'M001', 'M', '2019-07-19 04:04:07'),
('P003', '2019-07-20 03:13:00', 'PENDIENTE', 'EMP51', 'CLI01', 'M002', ' ', '2019-07-20 03:13:00'),
('P004', '2019-07-20 10:02:23', 'PENDIENTE', NULL, NULL, 'M001', '', '2019-07-20 10:02:23'),
('P005', '2019-07-20 13:25:48', 'PENDIENTE', 'EMP60', NULL, 'M001', '', '2019-07-20 13:25:48'),
('P006', '2019-07-20 13:31:18', 'PENDIENTE', 'EMP60', NULL, 'M001', '', '2019-07-20 13:31:18'),
('P007', '2019-07-20 13:35:59', 'PENDIENTE', 'EMP60', NULL, 'M001', '', '2019-07-20 13:35:59'),
('P008', '2019-07-20 13:37:13', 'PENDIENTE', 'EMP60', NULL, 'M001', '', '2019-07-20 13:37:13');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`cod_alimento`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cliente`),
  ADD UNIQUE KEY `documento` (`documento`);

--
-- Indices de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  ADD PRIMARY KEY (`id_detalle_pedido`),
  ADD KEY `pedido_det_fk6` (`cod_pedido`),
  ADD KEY `det_alimento_fk7` (`cod_alimento`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`cod_empleado`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`cod_factura`),
  ADD KEY `fact_pedido_fk8` (`cod_pedido`);

--
-- Indices de la tabla `medio_pago`
--
ALTER TABLE `medio_pago`
  ADD PRIMARY KEY (`id_cobro`),
  ADD KEY `cobro_fact_fk9` (`cod_factura`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`cod_mesa`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`cod_pedido`),
  ADD KEY `pedido_cliente_fk3` (`cod_cliente`),
  ADD KEY `pedido_empleado_fk4` (`cod_empleado`),
  ADD KEY `pedido_mesa_fk5` (`cod_mesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalle_pedido`
--
ALTER TABLE `detalle_pedido`
  MODIFY `id_detalle_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `medio_pago`
--
ALTER TABLE `medio_pago`
  MODIFY `id_cobro` int(11) NOT NULL AUTO_INCREMENT;

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
-- Filtros para la tabla `medio_pago`
--
ALTER TABLE `medio_pago`
  ADD CONSTRAINT `cobro_fact_fk9` FOREIGN KEY (`cod_factura`) REFERENCES `factura` (`cod_factura`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_cliente_fk3` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`cod_cliente`),
  ADD CONSTRAINT `pedido_empleado_fk4` FOREIGN KEY (`cod_empleado`) REFERENCES `empleado` (`cod_empleado`),
  ADD CONSTRAINT `pedido_mesa_fk5` FOREIGN KEY (`cod_mesa`) REFERENCES `mesa` (`cod_mesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
