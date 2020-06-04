-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: Localhost    Database: base_final
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tabla_busq_venta`
--

DROP TABLE IF EXISTS `tabla_busq_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_busq_venta` (
  `id_busq` int(11) NOT NULL,
  `mode_busq` varchar(45) DEFAULT NULL,
  `cara_busq` varchar(45) DEFAULT NULL,
  `colo_busq` varchar(45) DEFAULT NULL,
  `cant_busq` varchar(45) DEFAULT NULL,
  `prec_busq` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_busq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_busq_venta`
--

LOCK TABLES `tabla_busq_venta` WRITE;
/*!40000 ALTER TABLE `tabla_busq_venta` DISABLE KEYS */;
INSERT INTO `tabla_busq_venta` VALUES (1,'modelo','caracteristicaas','color','cantidad','precio');
/*!40000 ALTER TABLE `tabla_busq_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_ventas`
--

DROP TABLE IF EXISTS `tabla_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_ventas` (
  `dni_ven` int(11) NOT NULL,
  `pais_ven` varchar(45) NOT NULL,
  `ciud_ven` varchar(45) NOT NULL,
  `post_ven` varchar(45) NOT NULL,
  `dire_ven` varchar(45) NOT NULL,
  `id_busq` int(11) NOT NULL,
  PRIMARY KEY (`dni_ven`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_ventas`
--

LOCK TABLES `tabla_ventas` WRITE;
/*!40000 ALTER TABLE `tabla_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `dni_ven` int(11) DEFAULT NULL,
  `qr_id_mascarilla` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`),
  UNIQUE KEY `correo_UNIQUE` (`correo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('a','a','a','a',NULL,NULL),('clinjer','flores','@hotmail.com','123',NULL,NULL),('jose','roman','hotmail.com','123',NULL,NULL),('pepe','valdiviezo','yopmail.com','123',NULL,NULL),('usuario','usuario','correo','123',NULL,NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-04 12:12:08
