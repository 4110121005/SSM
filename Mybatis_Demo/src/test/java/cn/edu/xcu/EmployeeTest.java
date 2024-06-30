package cn.edu.xcu;

import cn.edu.xcu.mapper.EmployeeMapper;
import cn.edu.xcu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author JiangWei
 * @version 1.0
 * @description Mybatis测试类，用于测试Employee相关的数据库操作
 */
public class EmployeeTest {

    /**
     * 获取SqlSession对象的辅助方法
     * @return SqlSession对象
     * @throws IOException 如果读取配置文件失败，则抛出IOException
     */
    private SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    /**
     * 测试查询所有记录和按ID查询
     * @throws IOException 如果读取配置文件失败，则抛出IOException
     */
    @Test
    public void testSelect() throws IOException {
        try (SqlSession sqlSession = getSqlSession()) {
            // 方式一：直接使用配置文件中 SQL 元素的 id 来执行 SQL 语句
            List<Employee> employees = sqlSession.selectList("selectAll");
            System.out.println("所有员工信息：");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            // 按ID查询
            System.out.println("=====================================");
            Employee employee = sqlSession.selectOne("selectById", 2);
            System.out.println("ID为2的员工信息：" + employee);
        }
    }

    /**
     * 测试新增员工信息
     * @throws IOException 如果读取配置文件失败，则抛出IOException
     */
    @Test
    public void testAdd() throws IOException {
        try (SqlSession sqlSession = getSqlSession()) {
            // 方式二：通过方法返回的 Mapper 接口的代理对象来间接执行 SQL 语句
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

            // 新增员工信息
            System.out.println("=====================================");
            Employee newEmployee = new Employee(4, "王六", 26, "扫地工");
            int result = mapper.add(newEmployee);
            if (result > 0) {
                System.out.println("新增员工成功");
            }
            sqlSession.commit();
        }
    }

    /**
     * 测试按ID修改员工信息
     * @throws IOException 如果读取配置文件失败，则抛出IOException
     */
    @Test
    public void testUpdate() throws IOException {
        try (SqlSession sqlSession = getSqlSession()) {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

            // 按ID修改员工信息
            Employee updatedEmployee = new Employee();
            updatedEmployee.setId(3);
            updatedEmployee.setName("易班");
            updatedEmployee.setAge(19);
            updatedEmployee.setPosition("总经理");
            int result = mapper.update(updatedEmployee);
            if (result > 0) {
                System.out.println("修改员工信息成功");
            }
            sqlSession.commit();
        }
    }

    /**
     * 测试按ID删除员工信息
     * @throws IOException 如果读取配置文件失败，则抛出IOException
     */
    @Test
    public void testDelete() throws IOException {
        try (SqlSession sqlSession = getSqlSession()) {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

            // 按ID删除员工信息
            int result = mapper.delete(4);
            if (result > 0) {
                System.out.println("删除员工信息成功");
            }
            sqlSession.commit();
        }
    }
}
