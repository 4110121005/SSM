package cn.edu.xcu.service.impl;

import cn.edu.xcu.dao.AccountDao;
import cn.edu.xcu.domain.Account;
import cn.edu.xcu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService") // 代表这个类是服务层的服务类，且会被 Spring IOC 容器接管
public class AccountServiceImpl implements AccountService {
    @Autowired // 代表这个对象会被 Spring IOC 容器自动注入依赖
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return  accountDao.selectAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.insert(account);
    }
}
