-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: dbms
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bikemodel`
--

DROP TABLE IF EXISTS `bikemodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bikemodel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bikemodel`
--

LOCK TABLES `bikemodel` WRITE;
/*!40000 ALTER TABLE `bikemodel` DISABLE KEYS */;
INSERT INTO `bikemodel` VALUES (4,'pulsar'),(5,'duke'),(6,'rc200'),(7,'hayabusa'),(8,'cbz'),(9,'rc390'),(10,'fz250'),(11,'aviator'),(12,'brsgr'),(13,'gciwho'),(14,'aprella'),(15,'karizma');
/*!40000 ALTER TABLE `bikemodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart1`
--

DROP TABLE IF EXISTS `cart1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cart1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL,
  `spareparts_id` int(11) DEFAULT NULL,
  `qnty` int(11) DEFAULT NULL,
  `totalamount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  KEY `spareparts_id` (`spareparts_id`),
  CONSTRAINT `cart1_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE,
  CONSTRAINT `cart1_ibfk_2` FOREIGN KEY (`spareparts_id`) REFERENCES `spareparts` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart1`
--

LOCK TABLES `cart1` WRITE;
/*!40000 ALTER TABLE `cart1` DISABLE KEYS */;
INSERT INTO `cart1` VALUES (1,1,10,2,300),(2,1,10,2,300),(3,1,6,1,400),(4,1,14,1,1000),(5,1,10,1,150),(6,1,14,1,1000),(7,1,6,1,400),(8,3,9,1,60000),(9,3,9,1,60000);
/*!40000 ALTER TABLE `cart1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charges`
--

DROP TABLE IF EXISTS `charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `charges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `rate` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charges`
--

LOCK TABLES `charges` WRITE;
/*!40000 ALTER TABLE `charges` DISABLE KEYS */;
INSERT INTO `charges` VALUES (1,'engine_oil_replacement',130),(2,'fuel_filter',30),(3,'oil_filter',50),(4,'brake_fluid',70),(5,'engine_checkup',180),(6,'air_filter_cleaning',20),(7,'battery_charging',60),(8,'sparkplug_cleaning',15);
/*!40000 ALTER TABLE `charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(40) DEFAULT NULL,
  `mobileno` varchar(10) DEFAULT NULL,
  `model` int(11) DEFAULT NULL,
  `regno` varchar(10) DEFAULT NULL,
  `status` varchar(30) DEFAULT 'incomplete',
  `submited_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `problem` varchar(200) DEFAULT 'no problem just regular servicing',
  PRIMARY KEY (`id`),
  KEY `model` (`model`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`model`) REFERENCES `bikemodel` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'rahul','8380801646',4,'mh38rs5588','incomplete','2018-10-02 19:43:47','brakes not working'),(2,'prem','8380801646',6,'mh38rs5588','incomplete','2018-10-02 19:44:46','cluchplate not working\nnew tyres needed'),(3,'saurabh','7972166654',9,'mh43wq2311','incomplete','2018-10-02 22:10:15','');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `joining_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `mobileno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'rahul	',83808016,'2018-10-01 10:00:54','13431'),(9,'harshal',838080,'2018-10-01 10:46:23','59'),(10,'kulthe',452351,'2018-10-02 09:09:08','135'),(13,'saurabh	',5000,'2018-10-02 21:01:49','7972166654');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login` (
  `id` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `login_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('rahul','Rahul@123',1),('harshal','Harshal',9),('kulthe','cjafe',10),('saurabh','Saurabh',13);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spareparts`
--

DROP TABLE IF EXISTS `spareparts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `spareparts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `bike_id` int(11) DEFAULT NULL,
  `bp` int(11) DEFAULT NULL,
  `sp` int(11) DEFAULT NULL,
  `qnty` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bike_id` (`bike_id`),
  CONSTRAINT `spareparts_ibfk_1` FOREIGN KEY (`bike_id`) REFERENCES `bikemodel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spareparts`
--

LOCK TABLES `spareparts` WRITE;
/*!40000 ALTER TABLE `spareparts` DISABLE KEYS */;
INSERT INTO `spareparts` VALUES (1,'eiq',5,738,282,2),(2,'brake',6,200,300,3),(3,'tyres',7,2000,3000,5),(4,'headlamps',6,350,430,3),(5,'exhaust',5,2000,3000,3),(6,'wires',4,350,400,2),(8,'liners',5,350,400,2),(9,'engine',9,50000,60000,2),(10,'logo',4,100,150,6),(11,'wires',4,444,555,6),(13,'tyre',10,500,600,3),(14,'cluchplate',4,900,1000,4),(15,'suspension',11,1000,1200,10),(16,'alloywheels',11,800,100,3),(17,'vwsht',12,4636,2546,525),(18,'thieo',13,425,466,342),(19,'speedometer',14,250,300,5),(20,'diskbrake',15,400,500,22);
/*!40000 ALTER TABLE `spareparts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-03 15:25:58
