/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : fitness

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 12/04/2019 11:35:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for train_bencpress
-- ----------------------------
DROP TABLE IF EXISTS `train_bencpress`;
CREATE TABLE `train_bencpress`  (
  `userId` int(11) NOT NULL,
  `trainDate` date NOT NULL,
  `trainTime` time(0) NOT NULL,
  `typeId` int(3) NOT NULL DEFAULT 1,
  `number` int(4) NULL DEFAULT NULL,
  `weight` double NULL DEFAULT NULL,
  `unit` int(2) NULL DEFAULT 2
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of train_bencpress
-- ----------------------------
INSERT INTO `train_bencpress` VALUES (1, '2018-11-24', '10:54:13', 1, 3, 60, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-11-24', '10:55:16', 1, 4, 60, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-11-30', '10:58:06', 1, 6, 55, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-11-30', '10:59:00', 1, 6, 55, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-11-30', '10:59:02', 1, 6, 50, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-12-09', '11:01:46', 1, 4, 60, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-12-09', '11:01:48', 1, 5, 60, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-12-09', '11:01:50', 1, 3, 60, 2);
INSERT INTO `train_bencpress` VALUES (1, '2018-12-09', '11:01:54', 1, 5, 45, 2);

SET FOREIGN_KEY_CHECKS = 1;
