package edu.demo.service.impl;

import edu.demo.dao.UserDao;
import edu.demo.model.Users;
import edu.demo.service.UserService;
import edu.demo.service.exception.DemoException;
import edu.demo.service.interceptor.ServiceInterceptor;
import org.evergreen.aop.annotation.Interceptors;
import org.evergreen.beans.annotation.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Interceptors(ServiceInterceptor.class)
public class UserServiceImpl implements UserService {

    /**
     * 注入dao
     */
    @Resource
    private UserDao dao;

    @Override
    public Users findUser(String uid) {
        Users user = dao.findUserById(uid);
        if(user == null){
            throw new DemoException("用户不存在");
        }
        System.out.println(user.getUserName());
        return user;
    }

    @Override
    public List<Users> findUsers() {
        System.out.println("Find Users...");
        return dao.findUsers();
    }

    @Override
    public void saveUser(Users user) {
        if(dao.saveUser(user) == 0){
            throw new DemoException("添加失败");
        }
    }
}
