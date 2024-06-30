package cn.edu.xcu.pojo;

/**
 * @author JiangWei
 * @version 1.0
 * @description  员工实体类，对应数据库中的employee表
 */
public class Employee {
    /**
     * 员工ID
     */
    private int id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工年龄
     */
    private int age;
    /**
     * 员工职位
     */
    private String position;

    /**
     * 无参构造函数
     */
    public Employee() {
    }

    /**
     * 带参构造函数
     * @param id 员工ID
     * @param name 员工姓名
     * @param age 员工年龄
     * @param position 员工职位
     */
    public Employee(int id, String name, int age, String position) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    /**
     * 获取员工ID
     * @return 员工ID
     */
    public int getId() {
        return id;
    }

    /**
     * 设置员工ID
     * @param id 员工ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取员工姓名
     * @return 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工姓名
     * @param name 员工姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取员工年龄
     * @return 员工年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置员工年龄
     * @param age 员工年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取员工职位
     * @return 员工职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置员工职位
     * @param position 员工职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 重写toString方法，用于打印对象信息
     * @return 包含对象所有属性信息的字符串
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
