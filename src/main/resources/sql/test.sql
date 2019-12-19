/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-12-19 17:20:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `gorm_test`
-- ----------------------------
DROP TABLE IF EXISTS `gorm_test`;
CREATE TABLE `gorm_test` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of gorm_test
-- ----------------------------

-- ----------------------------
-- Table structure for `lottery_record`
-- ----------------------------
DROP TABLE IF EXISTS `lottery_record`;
CREATE TABLE `lottery_record` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '彩票表主键',
  `lotteryType` tinyint(4) DEFAULT NULL COMMENT '彩票类型 1 双色球  2大乐透',
  `num1` tinyint(4) DEFAULT NULL,
  `num2` tinyint(4) DEFAULT NULL,
  `num3` tinyint(4) DEFAULT NULL,
  `num4` tinyint(4) DEFAULT NULL,
  `num5` tinyint(4) DEFAULT NULL,
  `num6` tinyint(4) DEFAULT NULL,
  `num7` tinyint(4) DEFAULT NULL,
  `issueNumber` int(10) unsigned DEFAULT NULL COMMENT '期号',
  `createTime` datetime DEFAULT NULL,
  `openTime` date DEFAULT NULL COMMENT '开奖日期',
  `weekDay` int(11) DEFAULT NULL COMMENT '周几',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of lottery_record
-- ----------------------------

-- ----------------------------
-- Table structure for `money`
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `card` varchar(25) DEFAULT NULL,
  `annount` int(11) DEFAULT NULL,
  `st` int(11) DEFAULT NULL,
  `toName` varchar(25) DEFAULT NULL,
  `toCard` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES ('1', 'a', 'a1', '100', '-1', 'b', 'b1');
INSERT INTO `money` VALUES ('2', 'a', 'a1', '100', '1', 'b', 'b1');
INSERT INTO `money` VALUES ('3', 'c', 'c1', '100', '-1', 'b', 'b1');
INSERT INTO `money` VALUES ('4', 'c', 'c1', '100', '-1', 'a', 'a1');

-- ----------------------------
-- Table structure for `pt_admin`
-- ----------------------------
DROP TABLE IF EXISTS `pt_admin`;
CREATE TABLE `pt_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '兼职系统管理员账号表',
  `tel` varchar(15) DEFAULT NULL COMMENT '手机号码',
  `pwd` varchar(36) DEFAULT NULL COMMENT '密码',
  `token` varchar(36) DEFAULT NULL COMMENT '令牌',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createAdmin` int(10) unsigned DEFAULT NULL COMMENT '创建人',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `modifyAdmin` int(10) unsigned DEFAULT NULL COMMENT '修改人id',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1删除',
  `nickName` varchar(20) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_admin
-- ----------------------------
INSERT INTO `pt_admin` VALUES ('1', '123', '202cb962ac59075b964b07152d234b70', '123', '2019-11-14 09:53:37', null, null, null, '', 'p78o2');

-- ----------------------------
-- Table structure for `pt_admin_role`
-- ----------------------------
DROP TABLE IF EXISTS `pt_admin_role`;
CREATE TABLE `pt_admin_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ptAdminId` int(10) unsigned DEFAULT NULL,
  `ptRoleId` int(10) unsigned DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `createAdmin` int(10) unsigned DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `modifyAdmin` int(10) unsigned DEFAULT NULL,
  `isdel` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_admin_role
-- ----------------------------
INSERT INTO `pt_admin_role` VALUES ('1', '1', '1', '2019-11-14 09:57:37', '1', null, null, '');

-- ----------------------------
-- Table structure for `pt_company`
-- ----------------------------
DROP TABLE IF EXISTS `pt_company`;
CREATE TABLE `pt_company` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '公司表',
  `companyName` varchar(50) DEFAULT NULL COMMENT '公司名',
  `contactName` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contactPhone` varchar(15) DEFAULT NULL COMMENT '联系电话手机',
  `contactTel` varchar(15) DEFAULT NULL COMMENT '联系电话座机',
  `licenseImg` text COMMENT '营业执照',
  `address` varchar(500) DEFAULT NULL COMMENT '详细地址',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_company
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_company_admin`
-- ----------------------------
DROP TABLE IF EXISTS `pt_company_admin`;
CREATE TABLE `pt_company_admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '招聘信息发布人账号表',
  `tel` varchar(15) DEFAULT NULL COMMENT '管理员联系电话',
  `pwd` varchar(36) DEFAULT NULL COMMENT '密码',
  `token` varchar(36) DEFAULT NULL COMMENT '令牌',
  `companyId` int(11) DEFAULT NULL COMMENT '公司id（个人聘用者为0）',
  `isAdmin` bit(1) DEFAULT b'0' COMMENT '是否管理员  0 是 1 不是',
  `inviteCode` varchar(15) DEFAULT NULL COMMENT '邀请码（创建账号时系统生成）',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createCompanyAdminId` int(10) unsigned DEFAULT NULL COMMENT '给予管理员权限时的人的id（不是管理员就填0）',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `modifyUser` int(10) unsigned DEFAULT NULL COMMENT '修改人id',
  `isPersonal` bit(1) DEFAULT NULL COMMENT '是否个人聘用者（0不是  1是）',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_company_admin
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_permission`
-- ----------------------------
DROP TABLE IF EXISTS `pt_permission`;
CREATE TABLE `pt_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限表',
  `permissionName` varchar(20) DEFAULT NULL COMMENT '权限名称',
  `permissionUrl` varchar(50) DEFAULT NULL COMMENT '权限对应的url 有子权限的这个为空',
  `parentId` int(10) unsigned DEFAULT NULL COMMENT '父权限id 顶级为0',
  `createTime` datetime DEFAULT NULL,
  `createAdmin` int(10) unsigned DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `modifyAdmin` int(10) unsigned DEFAULT NULL,
  `isdel` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_permission
-- ----------------------------
INSERT INTO `pt_permission` VALUES ('1', '测试接口', '/pt/pt-admin/index/test', '0', '2019-11-14 09:56:53', '1', null, null, '');

-- ----------------------------
-- Table structure for `pt_role`
-- ----------------------------
DROP TABLE IF EXISTS `pt_role`;
CREATE TABLE `pt_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色表',
  `roleName` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `roleCode` varchar(50) DEFAULT NULL COMMENT '角色编号',
  `createTime` datetime DEFAULT NULL,
  `createAdmin` int(10) unsigned DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `modifyAdmin` int(10) unsigned DEFAULT NULL,
  `isdel` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_role
-- ----------------------------
INSERT INTO `pt_role` VALUES ('1', '管理员', 'Admin', '2019-11-14 09:55:43', '1', null, null, '');

-- ----------------------------
-- Table structure for `pt_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `pt_role_permission`;
CREATE TABLE `pt_role_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roleId` int(10) unsigned DEFAULT NULL,
  `permissionId` int(10) unsigned DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `createAdmin` int(10) unsigned DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `modifyAdmin` int(11) DEFAULT NULL,
  `isdel` bit(1) DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_role_permission
-- ----------------------------
INSERT INTO `pt_role_permission` VALUES ('1', '1', '1', '2019-11-14 09:57:51', '1', null, null, '');

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
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user
-- ----------------------------
INSERT INTO `pt_user` VALUES ('1', '测试账号', '123456', null, null, 'p78o2', 'e10adc3949ba59abbe56e057f20f883e', '8fccc8cd9d8b90499d093afa08c94b2f', null, null, null, null, '100', null, null, null, null, null, null, null, '2019-11-11 14:42:34', null, '');

-- ----------------------------
-- Table structure for `pt_user_resume`
-- ----------------------------
DROP TABLE IF EXISTS `pt_user_resume`;
CREATE TABLE `pt_user_resume` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '个人简历表',
  `ptUserId` int(11) DEFAULT NULL,
  `selfDescription` varchar(500) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '自我描述',
  `topEduction` varchar(200) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '最高学历',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
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
  `ptUserResumeDetailId` int(11) unsigned DEFAULT NULL COMMENT '简介id',
  `companyId` int(11) unsigned DEFAULT NULL COMMENT '发布工作的公司id',
  `workId` int(11) unsigned DEFAULT NULL COMMENT '工作id',
  `duty` varchar(500) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '工作职责',
  `evaluate` int(11) DEFAULT NULL COMMENT '聘用者对被聘用者评分',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `evaluateTime` datetime DEFAULT NULL COMMENT '聘用者评价时间',
  `finishTime` datetime DEFAULT NULL COMMENT '完成时间',
  `modifyTime` datetime DEFAULT NULL,
  `evaluateText` text CHARACTER SET utf8mb4 COMMENT '聘用者对被聘用者文字评价',
  `reEvaluateForWork` int(11) DEFAULT NULL COMMENT '被聘用者对工作评分',
  `reEvaluateTextForWork` text CHARACTER SET utf8mb4 COMMENT '被聘用者对工作文字评价',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
  `reEvaluateForAdmin` int(11) DEFAULT NULL COMMENT '被聘用者对工作发布者评分',
  `reEvaluateTextForAdmin` text CHARACTER SET utf8mb4 COMMENT '被聘用者对工作发布者文字评价',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pt_user_resume_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_work`
-- ----------------------------
DROP TABLE IF EXISTS `pt_work`;
CREATE TABLE `pt_work` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '发布的工作表',
  `workDuty` text COMMENT '工作职责',
  `settlementMethod` int(11) DEFAULT NULL COMMENT '结算方式 1、日结 2、周结 3、月结 4、工作完成后结',
  `requirement` text COMMENT '要求',
  `gemder` int(11) DEFAULT NULL COMMENT '性别要求 1、男 2、 女 3、不限',
  `totalNumber` int(11) DEFAULT '0' COMMENT '总共招收报名人数',
  `currentNumber` int(11) DEFAULT '0' COMMENT '当前报名人数',
  `beginTime` datetime DEFAULT NULL COMMENT '招聘开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '招聘结束时间',
  `workBeginTime` datetime DEFAULT NULL COMMENT '每日的工作开始时间',
  `workEndTime` datetime DEFAULT NULL COMMENT '每日工作结束时间',
  `title` varchar(50) DEFAULT NULL COMMENT '招聘信息标题',
  `unitPrice` float DEFAULT NULL COMMENT '单价/元',
  `unitLength` varchar(10) DEFAULT NULL COMMENT '单价的单位  小时  天  周  月  整个工作',
  `startTime` datetime DEFAULT NULL COMMENT '工作开始时间（长期有效的不用填）',
  `finishTime` datetime DEFAULT NULL COMMENT '工作结束时间（长期有效的不用填）',
  `isLongTerm` bit(1) DEFAULT b'0' COMMENT '是否长期有效 0不是 1 是',
  `companyId` int(10) unsigned DEFAULT NULL COMMENT '发布公司id（个人发布者为0）',
  `createCompanyAdminId` int(11) unsigned DEFAULT NULL COMMENT '工作发布者id',
  `workPlace` varchar(500) DEFAULT NULL COMMENT '工作详细地址',
  `isFixed` bit(1) DEFAULT b'0' COMMENT '是否到指定工作场所 0不是 1 是',
  `longitude` double DEFAULT NULL COMMENT '工作地址经度',
  `latitude` double DEFAULT NULL COMMENT '工作地址纬度',
  `createTime` datetime DEFAULT NULL COMMENT '消息创建时间',
  `modifyTime` datetime DEFAULT NULL COMMENT '消息修改时间',
  `modifyCompanyAdminId` int(10) unsigned DEFAULT NULL COMMENT '修改人id',
  `isOverdue` bit(1) DEFAULT b'0' COMMENT '是否过期 0没过期 1过期',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1已经删除',
  `workCategoryId` int(10) unsigned DEFAULT NULL COMMENT '类别id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_work
-- ----------------------------

-- ----------------------------
-- Table structure for `pt_work_category`
-- ----------------------------
DROP TABLE IF EXISTS `pt_work_category`;
CREATE TABLE `pt_work_category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '工作类别表',
  `categoryName` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `isdel` bit(1) DEFAULT b'0' COMMENT '是否删除 0正常 1 删除',
  `parentId` int(10) unsigned DEFAULT '0' COMMENT '父分类id，顶级为0',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createAdmin` int(10) unsigned DEFAULT NULL COMMENT '创建人',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `modifyAdmin` int(11) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pt_work_category
-- ----------------------------

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 NOT NULL,
  `age` int(11) NOT NULL DEFAULT '0',
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('2', 'p78o12', '0', null);
INSERT INTO `test` VALUES ('3', 'p78o12', '0', null);
