create database mybatis;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `position` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
INSERT INTO `employee` VALUES ('1', '张三', '20', '员工');
INSERT INTO `employee` VALUES ('2', '李四', '18', '员工');
INSERT INTO `employee` VALUES ('3', '王五', '35', '经理');
