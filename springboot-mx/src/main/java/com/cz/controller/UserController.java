package com.cz.controller;

import com.cz.bean.Users;
import com.cz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public String add(Users user){

        userService.add(user);
        return "添加成功！";
    }

    @RequestMapping("update")
    public String update(Users user){
        userService.update(user);
        return "";
    }
    @RequestMapping("queryLearnResouceById")
    public String queryLearnResouceById(Long id){
        userService.queryLearnResouceById(id);
        return "";
    }
    @RequestMapping("queryLearnResouceList")
    public String queryLearnResouceList(Map<String, Object> params){
        userService.queryLearnResouceList(params);
        return "";
    }



}
