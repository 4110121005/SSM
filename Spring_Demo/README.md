## 项目依赖

下面是 Spring 项目最基础的依赖（最新版本，截止2024.6.30）：

```
<!--
  Spring 的核心模块 Spring-core
  提供依赖注入（DI）和控制反转（IoC）等基础功能
-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>6.1.3</version>
</dependency>

<!--
  提供 Bean 工厂和 Bean 的定义，用于管理和配置应用程序中的对象
-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>6.1.3</version>
</dependency>

<!--
  构建在 core 模块之上，提供应用程序上下文，用于管理 bean 的生命周期和配置
-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.3</version>
</dependency>

<!--
面向切面编程（AOP）的支持，用于实现横切关注点，例如日志记录和事务管理。
-->
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-aop</artifactId>
  <version>6.1.3</version>
</dependency>
```

## 资源目录

### applicationContext_1.xml
Spring 配置文件。 
使用 XML 来注册 Bean，并在本案例中使用 Setter 的方式来装配 Bean。 
（构造方式装配和 Setter 方式无异，略）

### applicationContext_2.xml
Spring 配置文件。
（开启组件扫描）使用注解来注册 Bean 并装配 Bean

### applicationContext_3.xml
Spring 配置文件
使用 XML 来配置 Aop。

### applicationContext_4.xml
Spring 配置文件
使用注解来配置 Aop。

## 源码目录
### ioc 包
存放用来测试 IOC 和 DI 的类。
* Car 和 User 使用 XML 配置。
* Phone 和 Person 使用注解配置

### aop 包
存放用来测试 AOP 的类。
* MyAspect 和 UserService 使用 XML 配置
* YourAspect 和 PeopleService 使用注解配置

