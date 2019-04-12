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

 Date: 12/04/2019 11:34:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fitness_user
-- ----------------------------
DROP TABLE IF EXISTS `fitness_user`;
CREATE TABLE `fitness_user`  (
  `userId` int(4) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userPassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fitness_user
-- ----------------------------
INSERT INTO `fitness_user` VALUES (1, 'mfw', 'mfw1996');

SET FOREIGN_KEY_CHECKS = 1;
