## 项目依赖

下面是 SSM 框架整合后需要额外添加的依赖（最新版本，截止2024.6.30）：

```
<!-- Spring 和 Mybatis 整合包-->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>3.0.3</version>
</dependency>
<!-- 缺少 spring-jdbc 依赖可能会运行报错-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>6.1.3</version>
</dependency>
```

## 资源目录

### applicationContext.xml
Spring 整合 Mybatis 后的配置文件。

### mybatis-config.xml
Mybatis 配置文件。
（可以选择将配置全部迁移到 Spring 的配置文件中，不保留 Mybatis 配置文件）

### spring-mvc.xml
SpringMVC 配置文件。

## 源码目录
### controller 包
由 Spring MVC 负责

### dao 包
由 Mybatis 负责

### service 包
由 Spring 负责

### domain 包
存放领域实体。
（对于实体类，最佳的规范是：不使用 Spring IOC 容器管理。一般由持久层框架负责。）

## webapp 目录

### index.jsp
网站的默认的 jsp 页面

### WEB-INF/pages
存放 jsp 页面

### WEB-INF/web.xml
web 配置文件。
在该文件中添加一些配置，用来整合 Spring MVC 和 Spring

