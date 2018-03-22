/*
Navicat MySQL Data Transfer

Source Server         : 第一套 root 测试库
Source Server Version : 50717
Source Host           : 172.16.230.121:3306
Source Database       : simulator

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-22 18:05:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dbconfig
-- ----------------------------
DROP TABLE IF EXISTS `dbconfig`;
CREATE TABLE `dbconfig` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ip` varchar(255) NOT NULL,
  `mysqlport` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `passwd` varchar(255) NOT NULL,
  `dbname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dbconfig
-- ----------------------------
INSERT INTO `dbconfig` VALUES ('1', '172.16.230.121', '3306', 'root', 'root', 'bms');
INSERT INTO `dbconfig` VALUES ('2', '172.16.230.121', '3306', 'root', 'root', 'bmb');

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sale_flag` varchar(3) NOT NULL DEFAULT 'N',
  `valide_flag` varchar(50) NOT NULL DEFAULT '',
  `user_code` varchar(50) DEFAULT '',
  `name` varchar(255) DEFAULT NULL,
  `idno` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('1', 'Y', 'true', 'lujg', '明太子八', '150524198708244367');
