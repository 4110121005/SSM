-- 创建数据库
CREATE DATABASE ssm;
-- 使用数据库
USE ssm;
-- 创建表
CREATE TABLE account (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         NAME VARCHAR(20),
                         money DOUBLE
);

-- 插入14条数据
INSERT INTO account (NAME, money) VALUES
                                      ('张三', 1000.00),
                                      ('李四', 1500.50),
                                      ('王五', 2000.00),
                                      ('赵六', 800.75),
                                      ('孙七', 1200.25),
                                      ('周八', 900.50),
                                      ('吴九', 1100.00),
                                      ('郑十', 1300.75),
                                      ('陈十一', 1600.25),
                                      ('杨十二', 1900.00),
                                      ('刘十三', 700.50),
                                      ('何十四', 1400.75),
                                      ('马十五', 1700.25),
                                      ('谢十六', 2100.00);
