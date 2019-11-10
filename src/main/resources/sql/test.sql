/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-11-10 14:37:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `pt_user`
-- ----------------------------
DROP TABLE IF EXISTS `pt_user`;
CREATE TABLE `pt_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '兼职用户表',
  `userName` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '真实姓名',
  `tel` varchar(15) DEFAULT NULL,
  `wxCode` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `qqCode` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL,
  `nickName` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '昵称',
  `pwd` varchar(36) CHARACTER SET utf8mb4 DEFAULT NULL,
  `token` varchar(36) CHARACTER SET utf8mb4 DEFAULT NULL,
  `province` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL,
  `city` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL,
  `area` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL,
  `address` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL,
  `score` int(11) DEFAULT '100' COMMENT '信用积分',
  `emergencyContact` int(11) DEFAULT NULL COMMENT '紧急联系人关系 1 父亲 2母亲 3配偶 4朋友',
  `emergencyTel` varchar(15) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '紧急联系人电话',
  `idNum` varchar(18) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '身份证号码',
  `gender` int(11) DEFAULT NULL COMMENT '性别 1男 2 女 3其他',
  `idCardFront` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '身份证国徽面',
  `idCardBack` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '身份证人像面',
  `withIdCard` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '人和身份证一起',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user
-- ----------------------------

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', 'p78o2');
