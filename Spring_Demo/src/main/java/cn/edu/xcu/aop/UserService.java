package cn.edu.xcu.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void insert() {
        System.out.println("UserService：添加用户信息"); }
    public void delete() {
        System.out.println("UserService：删除用户信息"); }
    public void update() {
        System.out.println("UserService：更新用户信息"); }
    public void select() {
        System.out.println("UserService：查询用户信息"); }
}
