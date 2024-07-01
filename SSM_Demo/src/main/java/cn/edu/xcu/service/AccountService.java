package cn.edu.xcu.service;

import cn.edu.xcu.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
