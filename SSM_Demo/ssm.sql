/*
 Navicat Premium Data Transfer

 Source Server         : JavaEE
 Source Server Type    : MySQL
 Source Server Version : 80035 (8.0.35)
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 80035 (8.0.35)
 File Encoding         : 65001

 Date: 05/07/2023 12:50:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `money` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, '张三', 1000);
INSERT INTO `account` VALUES (2, '李四', 1500.5);
INSERT INTO `account` VALUES (3, '王五', 2000);
INSERT INTO `account` VALUES (4, '赵六', 800.75);
INSERT INTO `account` VALUES (5, '孙七', 1200.25);
INSERT INTO `account` VALUES (6, '周八', 900.5);
INSERT INTO `account` VALUES (7, '吴九', 1100);
INSERT INTO `account` VALUES (8, '郑十', 1300.75);
INSERT INTO `account` VALUES (9, '陈十一', 1600.25);
INSERT INTO `account` VALUES (10, '杨十二', 1900);
INSERT INTO `account` VALUES (11, '刘十三', 700.5);
INSERT INTO `account` VALUES (12, '何十四', 1400.75);
INSERT INTO `account` VALUES (13, '马十五', 1700.25);
INSERT INTO `account` VALUES (14, '谢十六', 2100);
INSERT INTO `account` VALUES (15, '', NULL);
INSERT INTO `account` VALUES (16, '姜维', 123456);
INSERT INTO `account` VALUES (17, '', NULL);
INSERT INTO `account` VALUES (18, '姜维', NULL);
INSERT INTO `account` VALUES (19, '', NULL);
INSERT INTO `account` VALUES (20, '姜维', 123456);

SET FOREIGN_KEY_CHECKS = 1;
