package edu.demo.dao;

import edu.demo.model.Users;

import java.util.List;

public interface UserDao {

    Users findUserById(String uid);

    List<Users> findUsers();

    int saveUser(Users user);
}
