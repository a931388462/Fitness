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

 Date: 12/04/2019 11:35:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for weight_unit
-- ----------------------------
DROP TABLE IF EXISTS `weight_unit`;
CREATE TABLE `weight_unit`  (
  `unitId` int(2) NOT NULL AUTO_INCREMENT,
  `unitName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`unitId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of weight_unit
-- ----------------------------
INSERT INTO `weight_unit` VALUES (1, '千克', 'kg');
INSERT INTO `weight_unit` VALUES (2, '磅', 'lb');

SET FOREIGN_KEY_CHECKS = 1;
