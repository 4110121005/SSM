## 项目依赖

下面是 Mybatis 项目最基础的依赖（最新版本，截止2024.6.30）：

```
<!--Mybatis依赖-->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.6</version>
</dependency>
<!--Mysql连接依赖-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

## 资源目录

### db.properties

数据库连接信息配置文件

### db_sql.txt

本案例中的数据库 SQL 语句

### mybatis-config.xml

MyBatis 的核心配置文件

### mapper 目录

存放各种映射文件

## 源码目录

### mapper 目录

映射器接口

### POJO 目录

数据库实体类
