package cn.edu.xcu;

import cn.edu.xcu.aop.PeopleService;
import cn.edu.xcu.aop.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class AOPTest {
    /**
     * 测试 XML 配置的 AOP
     */
    @Test
    @Order(1)
    public void XMLConfigTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_3.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        System.out.println("----执行userService的delete()----");
        userService.delete();

        System.out.println("----执行userService的insert()----");
        userService.insert();

        System.out.println("----执行userService的select()----");
        userService.select();

        System.out.println("----执行userService的update()----");
        userService.update();
    }

    /**
     * 测试注解配置的 AOP
     */
    @Test
    @Order(2)
    public void AnnotateConfigTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_4.xml");
        PeopleService peopleService = (PeopleService) applicationContext.getBean("peopleService");

        System.out.println("----执行peopleService的delete()----");
        peopleService.delete();

        System.out.println("----执行peopleService的insert()----");
        peopleService.insert();

        System.out.println("----执行peopleService的select()----");
        peopleService.select();

        System.out.println("----执行peopleService的update()----");
        peopleService.update();
    }
}
