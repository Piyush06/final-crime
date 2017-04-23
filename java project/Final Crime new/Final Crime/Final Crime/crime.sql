CREATE DATABASE  IF NOT EXISTS `crime` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `crime`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: crime
-- ------------------------------------------------------
-- Server version	5.6.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `arrestdetails`
--

DROP TABLE IF EXISTS `arrestdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `arrestdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `arrest_personname` varchar(45) DEFAULT NULL,
  `StationHead` varchar(45) DEFAULT NULL,
  `Matter` text,
  `ArrestDate` varchar(45) DEFAULT NULL,
  `ArrestTime` varchar(45) DEFAULT NULL,
  `StationName` varchar(45) DEFAULT NULL,
  `ArrestedPersonAddress` text,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `arrestdetails`
--

LOCK TABLES `arrestdetails` WRITE;
/*!40000 ALTER TABLE `arrestdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `arrestdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crimenews`
--

DROP TABLE IF EXISTS `crimenews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crimenews` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) DEFAULT NULL,
  `Description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crimenews`
--

LOCK TABLES `crimenews` WRITE;
/*!40000 ALTER TABLE `crimenews` DISABLE KEYS */;
/*!40000 ALTER TABLE `crimenews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criminaldetails`
--

DROP TABLE IF EXISTS `criminaldetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `criminaldetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CriminalName` varchar(45) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Time` varchar(45) DEFAULT NULL,
  `StationName` varchar(45) DEFAULT NULL,
  `CrimrAddress` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Age` varchar(45) DEFAULT NULL,
  `isMW` varchar(5) DEFAULT NULL,
  `imgaddress` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criminaldetails`
--

LOCK TABLES `criminaldetails` WRITE;
/*!40000 ALTER TABLE `criminaldetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `criminaldetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `firdetails`
--

DROP TABLE IF EXISTS `firdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `firdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cr_name` varchar(45) DEFAULT NULL,
  `StationHead` varchar(45) DEFAULT NULL,
  `matter` text,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `StationName` varchar(45) DEFAULT NULL,
  `cr_address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `user` varchar(45) DEFAULT NULL,
  `status` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `firdetails`
--

LOCK TABLES `firdetails` WRITE;
/*!40000 ALTER TABLE `firdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `firdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missingdetails`
--

DROP TABLE IF EXISTS `missingdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `missingdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mis_name` varchar(45) DEFAULT NULL,
  `age` varchar(12) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `s_name` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `img_address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `img_address_UNIQUE` (`img_address`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missingdetails`
--

LOCK TABLES `missingdetails` WRITE;
/*!40000 ALTER TABLE `missingdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `missingdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stationdetails`
--

DROP TABLE IF EXISTS `stationdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stationdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `StationName` varchar(45) DEFAULT NULL,
  `StatonHead` varchar(45) DEFAULT NULL,
  `Address` text,
  `ContactNo` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stationdetails`
--

LOCK TABLES `stationdetails` WRITE;
/*!40000 ALTER TABLE `stationdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `stationdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetail`
--

DROP TABLE IF EXISTS `userdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) DEFAULT NULL,
  `mname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `uname` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Mob` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetail`
--

LOCK TABLES `userdetail` WRITE;
/*!40000 ALTER TABLE `userdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `userdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userlogin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `victimdetails`
--

DROP TABLE IF EXISTS `victimdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `victimdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(45) DEFAULT NULL,
  `s_name` varchar(45) DEFAULT NULL,
  `v_address` varchar(45) DEFAULT NULL,
  `v_contact` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `cr_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `victimdetails`
--

LOCK TABLES `victimdetails` WRITE;
/*!40000 ALTER TABLE `victimdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `victimdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `witnessdetails`
--

DROP TABLE IF EXISTS `witnessdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `witnessdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `s_name` varchar(45) DEFAULT NULL,
  `w_address` varchar(45) DEFAULT NULL,
  `w_cnct` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `cr_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `witnessdetails`
--

LOCK TABLES `witnessdetails` WRITE;
/*!40000 ALTER TABLE `witnessdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `witnessdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'crime'
--

--
-- Dumping routines for database 'crime'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-09  1:40:35
