/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-11-11 00:00:26
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
  `withIdCard` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '人和身份证人像面一起',
  `createTime` datetime DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_user_resume`
-- ----------------------------
DROP TABLE IF EXISTS `pt_user_resume`;
CREATE TABLE `pt_user_resume` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '个人简历表',
  `ptUserId` int(11) DEFAULT NULL,
  `selfDescription` varchar(500) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '自我描述',
  `topEduction` varchar(200) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '最高学历',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user_resume
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_user_resume_detail`
-- ----------------------------
DROP TABLE IF EXISTS `pt_user_resume_detail`;
CREATE TABLE `pt_user_resume_detail` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '兼职用户简历工作记录表',
  `ptUserResumeDetailId` int(11) DEFAULT NULL COMMENT '简介id',
  `companyId` int(11) DEFAULT NULL COMMENT '发布工作的公司id',
  `workId` int(11) DEFAULT NULL COMMENT '工作id',
  `duty` varchar(500) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '工作职责',
  `evaluate` int(11) DEFAULT NULL COMMENT '工作完成后公司评分',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `evaluateTime` datetime DEFAULT NULL COMMENT '评价时间',
  `finishTime` datetime DEFAULT NULL COMMENT '完成时间',
  `modifyTime` datetime DEFAULT NULL,
  `evaluateText` text CHARACTER SET utf8mb4 COMMENT '文字评价',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user_resume_detail
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
