-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.32-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema reservas
--

CREATE DATABASE IF NOT EXISTS reservas;
USE reservas;

--
-- Definition of table `alquiler`
--

DROP TABLE IF EXISTS `alquiler`;
CREATE TABLE `alquiler` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fechaAlquiler` datetime NOT NULL,
  `fechaAlquilada` datetime NOT NULL,
  `codigoCancha` int(10) unsigned NOT NULL,
  `codigoCliente` int(10) unsigned NOT NULL,
  `codigoTurno` int(10) unsigned NOT NULL,
  `codigoReserva` int(10) unsigned DEFAULT NULL,
  `costo` double NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_alquiler_cancha` (`codigoCancha`),
  KEY `FK_alquiler_cliente` (`codigoCliente`),
  KEY `FK_alquiler_turno` (`codigoTurno`),
  KEY `FK_alquiler_reserva` (`codigoReserva`),
  CONSTRAINT `FK_alquiler_cancha` FOREIGN KEY (`codigoCancha`) REFERENCES `cancha` (`codigo`),
  CONSTRAINT `FK_alquiler_cliente` FOREIGN KEY (`codigoCliente`) REFERENCES `cliente` (`codigo`),
  CONSTRAINT `FK_alquiler_turno` FOREIGN KEY (`codigoTurno`) REFERENCES `turno` (`codigo`),
  CONSTRAINT `FK_alquiler_reserva` FOREIGN KEY (`codigoReserva`) REFERENCES `reserva` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alquiler`
--

/*!40000 ALTER TABLE `alquiler` DISABLE KEYS */;
/*!40000 ALTER TABLE `alquiler` ENABLE KEYS */;


--
-- Definition of table `cancha`
--

DROP TABLE IF EXISTS `cancha`;
CREATE TABLE `cancha` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `capacidad` int(10) unsigned NOT NULL,
  `fechaultmant` datetime NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cancha`
--

/*!40000 ALTER TABLE `cancha` DISABLE KEYS */;
/*!40000 ALTER TABLE `cancha` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  `telefono` int(10) unsigned NOT NULL,
  `dni` int(10) unsigned NOT NULL,
  `apellidopat` varchar(45) NOT NULL,
  `apellidomat` varchar(45) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `ruc` int(10) unsigned NOT NULL,
  `razonsocial` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
CREATE TABLE `reserva` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fechaReserva` datetime NOT NULL,
  `fechaReservada` datetime NOT NULL,
  `codigoCancha` int(10) unsigned NOT NULL,
  `codigoCliente` int(10) unsigned NOT NULL,
  `codigoTurno` int(10) unsigned NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_reserva_cancha` (`codigoCancha`),
  KEY `FK_reserva_cliente` (`codigoCliente`),
  KEY `FK_reserva_turno` (`codigoTurno`),
  CONSTRAINT `FK_reserva_cancha` FOREIGN KEY (`codigoCancha`) REFERENCES `cancha` (`codigo`),
  CONSTRAINT `FK_reserva_cliente` FOREIGN KEY (`codigoCliente`) REFERENCES `cliente` (`codigo`),
  CONSTRAINT `FK_reserva_turno` FOREIGN KEY (`codigoTurno`) REFERENCES `turno` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reserva`
--

/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;


--
-- Definition of table `tarifa`
--

DROP TABLE IF EXISTS `tarifa`;
CREATE TABLE `tarifa` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `diasemana` int(10) unsigned NOT NULL,
  `valor` double NOT NULL,
  `codigoTurno` int(10) unsigned NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_tarifa_turno` (`codigoTurno`),
  CONSTRAINT `FK_tarifa_turno` FOREIGN KEY (`codigoTurno`) REFERENCES `turno` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tarifa`
--

/*!40000 ALTER TABLE `tarifa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarifa` ENABLE KEYS */;


--
-- Definition of table `turno`
--

DROP TABLE IF EXISTS `turno`;
CREATE TABLE `turno` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `horainicio` int(10) unsigned NOT NULL,
  `horafin` int(10) unsigned NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `turno`
--

/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
