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

 Date: 12/04/2019 11:35:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for train_squat
-- ----------------------------
DROP TABLE IF EXISTS `train_squat`;
CREATE TABLE `train_squat`  (
  `userId` int(11) NOT NULL,
  `trainDate` date NOT NULL,
  `trainTime` time(0) NOT NULL,
  `typeId` int(3) NOT NULL DEFAULT 3,
  `number` int(4) NULL DEFAULT NULL,
  `weight` double NULL DEFAULT NULL,
  `unit` int(2) NULL DEFAULT 2
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of train_squat
-- ----------------------------
INSERT INTO `train_squat` VALUES (1, '2018-11-18', '13:44:19', 3, 5, 80, 2);
INSERT INTO `train_squat` VALUES (1, '2018-11-18', '13:44:19', 3, 4, 82.5, 2);
INSERT INTO `train_squat` VALUES (1, '2018-11-29', '13:44:19', 3, 6, 80, 2);
INSERT INTO `train_squat` VALUES (1, '2018-11-29', '13:44:19', 3, 5, 85, 2);
INSERT INTO `train_squat` VALUES (1, '2018-11-29', '13:44:19', 3, 5, 85, 2);

SET FOREIGN_KEY_CHECKS = 1;
