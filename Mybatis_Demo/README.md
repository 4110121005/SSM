## 项目依赖

较新版本，截止 2024.6.30：

```
<dependencies>
    <!--
      1、Mybatis 核心库：提供与数据库交互的 API 和运行时环境
    -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.6</version>
    </dependency>

    <!--
      2、数据库驱动：连接目标数据库所需的 JDBC 驱动程序
      常用的数据库是 MySQL，以此为例
    -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
    <!--对于mysql连接驱动，自8.0.33开始，已迁移到下面-->
    <!--
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        &lt;!&ndash;使用该组，版本最低是 8.0.31&ndash;&gt;
        <version>8.0.31</version>
    </dependency>
    -->

    <!--
      3、连接池（可选但推荐）: 提高数据库访问性能
        有很多连接池，以阿里巴巴的为例
    -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid</artifactId>
        <version>1.2.23</version>
    </dependency>
</dependencies>
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

（Mybatis中使用注解进行映射比较简单，所以略过）

## 源码目录

### mapper 目录

映射器接口

### POJO 目录

数据库实体类
