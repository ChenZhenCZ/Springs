package com.cz.controller;

import com.cz.bean.Users;
import com.cz.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/getUser")
    public List<Users> getUser(){
        List<Users> usersList=userDAO.findAll();
        return usersList;
    }

    @RequestMapping("getId")
    public Users getId(Integer id){
       Users users=userDAO.getOne(id);
        return users;
    }
}
