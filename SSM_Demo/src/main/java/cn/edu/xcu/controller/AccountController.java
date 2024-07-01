package cn.edu.xcu.controller;

import cn.edu.xcu.domain.Account;
import cn.edu.xcu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 账户控制器类
 * 处理与账户相关的请求
 *
 * @Author JiangWei
 */
@Controller // 代表这个类是控制层的处理器，且会被 Spring IOC 容器接管
@RequestMapping("/account") // 代表 Spring MVC 会拦截 /account 路径的请求，并转发给该类处理
public class AccountController {

    @Autowired // 代表这个对象会被 Spring IOC 容器自动注入依赖
    private AccountService accountService;

    /**
     * 获取所有账户信息
     *
     * @param model 视图模型对象
     * @return 返回视图名称
     */
    @GetMapping("/getAll") // 代表 Spring MVC 会拦截 /account/getAll 路径的 get 请求
    public String getAll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);

        return "success"; // 代表 Spring MVC 会跳转到 success.jsp 页面
    }

    /**
     * 保存账户信息
     *
     * @param account 账户对象
     * @return 返回视图名称
     */
    @PostMapping("/save") // 代表 Spring MVC 会拦截 /account/save 路径的 post 请求
    public String save(Account account) {
        accountService.saveAccount(account);
        return "success";
    }

}
