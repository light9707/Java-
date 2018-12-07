/*
SQLyog Ultimate v11.42 (64 bit)
MySQL - 5.6.42 : Database - shopdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shopdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shopdb`;

/*Table structure for table `ec_article` */

DROP TABLE IF EXISTS `ec_article`;

CREATE TABLE `ec_article` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE_CODE` varchar(100) DEFAULT NULL,
  `TITLE` varchar(200) DEFAULT NULL,
  `SUPPLIER` varchar(20) DEFAULT NULL,
  `PRICE` double DEFAULT NULL,
  `DISCOUNT` double DEFAULT NULL,
  `LOCALITY` varchar(300) DEFAULT NULL,
  `PUTAWAY_DATE` datetime DEFAULT NULL,
  `STORAGE` int(11) DEFAULT '100',
  `IMAGE` varchar(200) DEFAULT NULL,
  `DESCRIPTION` varchar(500) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `DISABLED` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `FK_ARTICLE_TYPE` (`TYPE_CODE`),
  CONSTRAINT `FK_ARTICLE_TYPE` FOREIGN KEY (`TYPE_CODE`) REFERENCES `ec_article_type` (`CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `ec_article` */

insert  into `ec_article`(`ID`,`TYPE_CODE`,`TITLE`,`SUPPLIER`,`PRICE`,`DISCOUNT`,`LOCALITY`,`PUTAWAY_DATE`,`STORAGE`,`IMAGE`,`DESCRIPTION`,`CREATE_DATE`,`DISABLED`) values (1,'00010001','各类用瓶','',108,0.7,'','0000-00-00 00:00:00',100,'','','0000-00-00 00:00:00',0),(2,'00010001','各类物品','',58,0.7,'','0000-00-00 00:00:00',100,'','','0000-00-00 00:00:00',0),(3,'00010001','各类需求','',118,0.7,'','0000-00-00 00:00:00',100,'','','0000-00-00 00:00:00',0);

/*Table structure for table `ec_article_type` */

DROP TABLE IF EXISTS `ec_article_type`;

CREATE TABLE `ec_article_type` (
  `CODE` varchar(100) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CODE`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ec_article_type` */

insert  into `ec_article_type`(`CODE`,`NAME`,`REMARK`) values ('0001','客户需求',''),('00010001','----物品派送（远）',''),('00010002','----代购',''),('00010003','----代拿快递',''),('0003','Vip服务',''),('00030001','----代写论文',''),('00030002','----代考',''),('00030003','----中性香水','中性香水');

/*Table structure for table `ec_user` */

DROP TABLE IF EXISTS `ec_user`;

CREATE TABLE `ec_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOGIN_NAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `SEX` int(11) DEFAULT '1',
  `EMAIL` varchar(50) DEFAULT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `ROLE` int(11) DEFAULT '1',
  `CREATE_DATE` datetime DEFAULT NULL,
  `DISABLED` tinyint(1) DEFAULT '0',
  `ACTIVE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `LOGIN_NAME` (`LOGIN_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `ec_user` */

insert  into `ec_user`(`ID`,`LOGIN_NAME`,`PASSWORD`,`NAME`,`SEX`,`EMAIL`,`PHONE`,`ADDRESS`,`ROLE`,`CREATE_DATE`,`DISABLED`,`ACTIVE`) values (1,'admin','123456','管理员',1,'test@163.com','18998665678','珠江新城',2,'2017-10-25 15:44:11',1,NULL),(2,'test1','123456','张大林',1,'test1@163.com','13487890989','天河车陂',1,'2017-10-25 15:44:11',1,NULL),(7,'test5','2222','test',3,'10923@qq.com','13629233728','广州',1,'2018-03-03 11:42:30',0,NULL),(8,'test6','2222','test',3,'10923@qq.com','13629233728','广州',1,'2018-03-03 11:42:49',0,NULL),(9,'last','2222','test',3,'10923@qq.com','13629233728','广州',1,'2018-03-03 13:25:52',0,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
