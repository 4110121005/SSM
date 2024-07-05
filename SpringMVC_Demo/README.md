## 项目依赖

较新版本，截止2024.6.30：

```
<!--
  1、提供了基础的 Web 功能，例如多部分文件上传、Servlet 监听器初始化 IoC 容器。
-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>6.1.3</version>
</dependency>

<!--
  2、Spring MVC 框架的核心模块：包含了实现 Web 应用程序所需的所有组件，例如控制器、视图解析器等。
-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>6.1.3</version>
</dependency>

<!--
  3.1、Servlet API: 提供 Servlet 容器交互的 API
-->
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.0.0</version>
</dependency>

<!--
  3.2 JSP
-->
<dependency>
    <groupId>jakarta.servlet.jsp</groupId>
    <artifactId>jakarta.servlet.jsp-api</artifactId>
    <version>4.0.0</version>
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

