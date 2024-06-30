package cn.edu.xcu.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("JiangWei")
    private String name;

    @Value("22")
    private int age;

    @Autowired
    private Phone phone;

    public Person() {
        System.out.println("Person的无参构造函数");
    }

    public Phone getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
