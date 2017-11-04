package edu.demo.controller;

import edu.demo.model.Users;
import edu.demo.service.UserService;
import edu.demo.service.exception.DemoException;
import org.evergreen.beans.annotation.Component;
import org.evergreen.web.ViewResult;
import org.evergreen.web.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserController extends BaseController{

    /**
     * 注入Service
     */
    @Resource
    private UserService service;

    @RequestMapping("/findUser/{uid}")
    public ViewResult findUser(String uid){
        try {
            Users user = service.findUser(uid);
            return successJson(user);
        } catch (DemoException e) {
            return errorJson(e.getMessage());
        }
    }

    @RequestMapping("/findUsers")
    public ViewResult findUsers(){
        List<Users> list = service.findUsers();
        return successJson(list);
    }

    @RequestMapping("/saveUser")
    public ViewResult saveUser(Users user){
        try {
            service.saveUser(user);
        } catch (DemoException e) {
            return errorJson(e.getMessage());
        }
        return successJson();
    }
}
