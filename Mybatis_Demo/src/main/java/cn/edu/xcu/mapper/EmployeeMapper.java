package cn.edu.xcu.mapper;

import cn.edu.xcu.pojo.Employee;

import java.util.List;

/**
 * @author JiangWei
 * @version 1.0
 * @description EmployeeMapper接口提供了对Employee实体类的数据库操作方法
 */
public interface EmployeeMapper {

    /**
     * 查询所有Employee记录
     * @return 所有Employee记录的List集合
     */
    List<Employee> selectAll();

    /**
     * 根据id查询Employee记录
     * @param id Employee的id
     * @return 对应id的Employee对象，如果不存在则返回null
     */
    Employee selectById(int id);

    /**
     * 添加一条Employee记录
     * @param employee 要添加的Employee对象
     * @return 受影响的行数
     */
    int add(Employee employee);

    /**
     * 根据id更新Employee记录
     * @param employee 要更新的Employee对象，包含要更新的id
     * @return 受影响的行数
     */
    int update(Employee employee);

    /**
     * 根据id删除Employee记录
     * @param id 要删除的Employee的id
     * @return 受影响的行数
     */
    int delete(int id);
}
