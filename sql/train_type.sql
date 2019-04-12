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

 Date: 12/04/2019 11:35:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for train_type
-- ----------------------------
DROP TABLE IF EXISTS `train_type`;
CREATE TABLE `train_type`  (
  `typeId` int(3) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tableName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`typeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of train_type
-- ----------------------------
INSERT INTO `train_type` VALUES (1, '卧推', 'train_bencpress');
INSERT INTO `train_type` VALUES (2, '硬拉', 'train_harddrawn');
INSERT INTO `train_type` VALUES (3, '深蹲', 'train_squat');

SET FOREIGN_KEY_CHECKS = 1;
