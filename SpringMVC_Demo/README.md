## 项目依赖

下面是 Spring 项目最基础的依赖（最新版本，截止2024.6.30）：

```
<!--Spring MVC-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>6.1.10</version>
</dependency>

<!-- Servlet -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>

<!--JSP-->
<dependency>
    <groupId>javax.servlet.jsp</groupId>
    <artifactId>jsp-api</artifactId>
    <version>2.2</version>
    <scope>provided</scope>
</dependency>
```

## 资源目录

### spring-mvc.xml
SpringMVC 配置文件。 
使用注解来配置 Controller。
（XML 配置 Controller 有些复杂，实际开发中也不常用，略）

## 源码目录
### controller 包
存放控制器

## webapp 目录

### index.jsp
网站的默认的 jsp 页面

### WEB-INF/pages
存放 jsp 页面

### WEB-INF/web.xml
web 配置文件，这里主要用于配置前端控制器

