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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `tipo` varchar(31) NOT NULL,
  `id_cliente` bigint NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `status_cliente` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `cnpj` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('pf',1,'caiomoliveira@gmail.com','Rua Assunção, 3200','Caio Martins de Oliveira','ATIVO','25356254458',NULL),('pf',3,'anamartins@gmail.com','Rua Alegórica, 240','Ana Martins','ATIVO','12565845500',NULL),('pf',5,'lauraalmeida@gmail.com','Rua Jequitibas, 100','Laura Almeida','ATIVO','12456253580',NULL),('pf',7,'clarasantos@gmail.com','Rua das Perobas, 2100','Ana Clara dos Sanros','ATIVO','14585465822',NULL),('pf',9,'jeanalbuquerque@gmail.com','Alameda da Saúde, 500','Jean Alves de Albuquerque','ATIVO','12447855545',NULL),('pj',11,'restaurantebomapetite@gmail.com','Rua Estados Unidos, 245','Restaurante Bom Apetite','ATIVO',NULL,'43.2020.1536/0001-00'),('pj',13,'laboratoriaaura@gmail.com','Rua México, 23','Laboratório Aura','ATIVO',NULL,'23.2023.1452/0001-00'),('pj',15,'mercadomm@gmail.com','Rua Jequitibas, 230','Mercado Mais e Melhor','ATIVO',NULL,'23.1452.1452/0001-00'),('pf',17,'alexandrealves@gmail.com','Rua Inglaterra, 600','Alexandre Alves','ATIVO','14585895822',NULL),('pj',19,'automecanicaabc@gmail.com','Rua dos Alemães, 560','Auto Mecânica ABC','ATIVO',NULL,'43.5259.1536/0001-00');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-23 15:35:31
