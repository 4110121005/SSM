package cn.edu.xcu;

import cn.edu.xcu.ioc.Person;
import cn.edu.xcu.ioc.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * 测试 Spring IOC 容器
 *
 * @author JiangWei
 */
public class IocTest {

    /**
     * 测试 XML 配置的 bean
     */
    @Test
    @Order(1)
    public void XMLConfigTest() {
        // 1、加载 applicationContext_1.xml 配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_1.xml");
        // 2 从 IOC 容器中获取一个 bean
        User user = (User) applicationContext.getBean("user");
        // 3 使用 bean
        System.out.println(user);
    }

    /**
     * 测试注解配置的 bean
     */
    @Test
    @Order(2)
    public void AnnotateConfigTest() {
        // 1、加载 applicationContext_1.xml 配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_2.xml");
        // 2 从 IOC 容器中获取一个 bean
        Person person = (Person) applicationContext.getBean("person");
        // 3 使用 bean
        System.out.println(person);
    }
}
