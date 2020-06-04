-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: PSMIS
-- ------------------------------------------------------
-- Server version 5.7.29-0ubuntu0.16.04.1

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
-- Table structure for table `f_apply`
--

DROP TABLE IF EXISTS `f_apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `f_apply` (
  `fa_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) NOT NULL,
  `fid` int(11) NOT NULL,
  `fa_time` bigint(20) NOT NULL,
  `fa_flag` int(11) NOT NULL,
  `fa_reviewer` varchar(30) NOT NULL,
  PRIMARY KEY (`fa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `f_apply`
--

LOCK TABLES `f_apply` WRITE;
/*!40000 ALTER TABLE `f_apply` DISABLE KEYS */;
INSERT INTO `f_apply` VALUES (1,'172219605201',1,1591190693363,0,'无'),(2,'172219605222',5,1591229578664,0,'无'),(3,'172219605222',2,1591229590641,0,'无'),(4,'172219605218',3,1591229706101,0,'无'),(5,'172219605201',5,1591229774552,0,'无'),(6,'172219605102',4,1591229829864,0,'无'),(7,'172219605220',4,1591229907122,0,'无');
/*!40000 ALTER TABLE `f_apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fund`
--

DROP TABLE IF EXISTS `fund`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fund` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(30) NOT NULL,
  `f_abs` text NOT NULL,
  `f_amount` double NOT NULL,
  `f_time` bigint(20) NOT NULL,
  `f_img` varchar(50) NOT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fund`
--

LOCK TABLES `fund` WRITE;
/*!40000 ALTER TABLE `fund` DISABLE KEYS */;
INSERT INTO `fund` VALUES (1,'新生入学资助项目','中西部生源的家庭经济困难新生可申请入学资助项目，解决入校报到的交通费和入学后短期生活费。就读本省院校的新生每人500元，就读省外院校的新生每人1000元。学生可向当地县级教育部门咨询办理。',500,1591228385793,'2.jpg'),(2,'国家助学贷款','家庭经济困难学生可申请办理国家助学贷款，解决学费与住宿费，每人每年最高不超过8000元，在校期间利息由国家承担，还款期限原则上按学制加13年确定，最长不超过20年。国家助学贷款包括生源地信用助学贷款与校园地国家助学贷款，家庭经济困难学生可向户籍所在县(市、区)的学生资助管理机构咨询办理生源地信用助学贷款，或向高校学生资助部门咨询办理校园地国家助学贷款。',8000,1591228413882,'10.jpg'),(3,'国家助学金','家庭经济困难学生入学后可申请国家助学金，解决在校学习期间的生活费，平均每人每年3000元。学生持《家庭经济困难学生认定申请表》于每年9月向高校提出申请，高校每学年评定一次。\r\n\r\n',3000,1591228440029,'5.jpg'),(4,'国家奖学金','特别优秀的学生，从二年级起可申请获得国家奖学金，每人每年8000元。颁发国家统一印制的荣誉证书，并记入学生的学籍档案。',8000,1591228469397,'6.jpg'),(5,'国家励志奖学金','品学兼优的家庭经济困难学生，从二年级起可申请获得国家励志奖学金，每人每年5000元。高校将获奖情况记入学生的学籍档案。',5000,1591228499083,'9.jpg');
/*!40000 ALTER TABLE `fund` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu`
--

DROP TABLE IF EXISTS `stu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stu` (
  `s_id` varchar(20) NOT NULL,
  `s_name` varchar(30) NOT NULL,
  `s_nation` varchar(10) NOT NULL,
  `s_sex` varchar(10) NOT NULL,
  `s_birth` varchar(50) NOT NULL,
  `s_major` varchar(50) NOT NULL,
  `s_phone` varchar(20) NOT NULL,
  `s_address` varchar(255) NOT NULL,
  `s_income` double NOT NULL,
  `s_res` text NOT NULL,
  `s_info` text NOT NULL,
  `s_other` text NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu`
--

LOCK TABLES `stu` WRITE;
/*!40000 ALTER TABLE `stu` DISABLE KEYS */;
INSERT INTO `stu` VALUES ('162219605124','王新硕','','','','','','',0,'','',''),('172219605102','邵倩','汉','','','','','',0,'','',''),('172219605201','江芳','汉','女','2020-06-05','','','',0,'','',''),('172219605218','穆成浩','汉','男','','','','',0,'','',''),('172219605219','潘晴无雨','汉','男','','','','',0,'','',''),('172219605220','钱聿豪','汉','','','','','',0,'','',''),('172219605221','宋子豪','汉','男','2020-06-16','软件工程','','',0,'','',''),('172219605222','王庚辉','汉','男','','','','',0,'','','');
/*!40000 ALTER TABLE `stu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `u_id` varchar(20) NOT NULL,
  `u_name` varchar(30) NOT NULL,
  `u_password` varchar(20) NOT NULL,
  `u_power` int(11) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('162219605124','王新硕','123456',0),('172219605102','邵倩','123456',0),('172219605201','江芳','123456',0),('172219605218','穆成浩','123456',1),('172219605219','潘晴无雨','123456',1),('172219605220','钱聿豪','123456',0),('172219605221','宋子豪','123456',1),('172219605222','王庚辉','123456',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `w_apply`
--

DROP TABLE IF EXISTS `w_apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `w_apply` (
  `wa_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) NOT NULL,
  `fid` int(11) NOT NULL,
  `wa_time` bigint(20) NOT NULL,
  `wa_flag` int(11) NOT NULL,
  `wa_reviewer` varchar(30) NOT NULL,
  PRIMARY KEY (`wa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `w_apply`
--

LOCK TABLES `w_apply` WRITE;
/*!40000 ALTER TABLE `w_apply` DISABLE KEYS */;
INSERT INTO `w_apply` VALUES (1,'172219605201',1,1591190679936,0,'无'),(2,'172219605222',6,1591229607442,0,'无'),(3,'172219605222',3,1591229619044,0,'无'),(4,'172219605218',2,1591229683721,0,'无'),(5,'172219605218',4,1591229693064,0,'无'),(6,'172219605201',6,1591229800804,0,'无'),(7,'172219605102',2,1591229836270,0,'无'),(8,'172219605220',2,1591229879884,0,'无'),(9,'172219605220',4,1591229902382,0,'无');
/*!40000 ALTER TABLE `w_apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work`
--

DROP TABLE IF EXISTS `work`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work` (
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(30) DEFAULT NULL,
  `w_abs` text NOT NULL,
  `w_time` bigint(20) NOT NULL,
  `w_position` varchar(255) NOT NULL,
  `w_money` double NOT NULL,
  `w_img` varchar(50) NOT NULL,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work`
--

LOCK TABLES `work` WRITE;
/*!40000 ALTER TABLE `work` DISABLE KEYS */;
INSERT INTO `work` VALUES (2,'图书馆管理员','整理图书，管理图书借阅，做到有序有证借阅，维护图书馆秩序',1591228918851,'图书馆',8,'library.jpg'),(3,'食堂打饭','为学生打饭',1591228991217,'食堂',12,'dininghall.jpg'),(4,'实验室管理人员','实验室管理仪器，整理仪器，打扫实验室',1591229098411,'实验室',15,'lab.jpeg'),(5,'超市收银员','在大学城超市收银',1591229211662,'大学城超市',8,'cashier.jpeg'),(6,'数码城维修学徒','帮助数码城维修师傅做维修工作',1591229318863,'数码城',16,'fix.jpg');
/*!40000 ALTER TABLE `work` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-04  8:22:42
