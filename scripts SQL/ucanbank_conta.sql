-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: ucanbank
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `conta`
--

DROP TABLE IF EXISTS `conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conta` (
  `id_conta` bigint NOT NULL,
  `agencia` varchar(255) DEFAULT NULL,
  `numconta` int DEFAULT NULL,
  `random` tinyblob,
  `saldo` double DEFAULT NULL,
  `clientepf_id_cliente` bigint DEFAULT NULL,
  `clientepj_id_cliente` bigint DEFAULT NULL,
  PRIMARY KEY (`id_conta`),
  KEY `FK82qcy6hatk6hh9k5l5roden2t` (`clientepf_id_cliente`),
  KEY `FKcw3lsm1c7w1tpfrmrmaesx9b4` (`clientepj_id_cliente`),
  CONSTRAINT `FK82qcy6hatk6hh9k5l5roden2t` FOREIGN KEY (`clientepf_id_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `FKcw3lsm1c7w1tpfrmrmaesx9b4` FOREIGN KEY (`clientepj_id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conta`
--

LOCK TABLES `conta` WRITE;
/*!40000 ALTER TABLE `conta` DISABLE KEYS */;
INSERT INTO `conta` VALUES (2,'0102',940,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0ÜÚô4\0x',500,1,NULL),(4,'0102',2305,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0™\ﬂdKV$x',350,3,NULL),(6,'0102',3825,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0\0v?õ∂∞x',180,5,NULL),(8,'0102',2265,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\01hD™¥àx',450,7,NULL),(10,'0102',500,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0\Î\ÿ¯4x',350,9,NULL),(12,'8119',4075,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0}``àx',770,NULL,11),(14,'8119',305,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0\Z\≈UõÒx',1850,NULL,13),(16,'8119',1810,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0î°\ËE8úx',1000,NULL,15),(18,'0102',4715,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0¶∏©èXhx',400,17,NULL),(20,'8119',1885,_binary '¨\Ì\0sr\0java.util.Random62ñ4K\nS\0Z\0haveNextNextGaussianD\0nextNextGaussianJ\0seedxp\0\0\0\0\0\0\0\0\0\0\0t\'\\Ú¯x',2400,NULL,19);
/*!40000 ALTER TABLE `conta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-23 15:35:29
