package edu.demo.service;

import edu.demo.model.Users;

import java.util.List;

public interface UserService {

    Users findUser(String uid);

    List<Users> findUsers();

    void saveUser(Users user);
}
