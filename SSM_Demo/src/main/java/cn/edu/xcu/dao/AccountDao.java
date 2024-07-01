package cn.edu.xcu.dao;

import cn.edu.xcu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户数据访问对象接口，提供对账户数据的增删改查操作.
 *
 * @author JiangWei
 * @version 1.0
 */
@Repository // 代表这个类是持久层的类，且会被 Spring IOC 容器接管
public interface AccountDao {

    /**
     * 查询所有账户信息.
     *
     * @return 包含所有账户信息的列表
     */
    @Select("select * from account") //代表 Mybatis 中的 SQL 映射语句
    List<Account> selectAll();

    /**
     * 插入一条新的账户信息.
     *
     * @param account 要插入的账户对象
     */
    @Insert("insert into account (name, money) values(#{name}, #{money})")
    void insert(Account account);

}
