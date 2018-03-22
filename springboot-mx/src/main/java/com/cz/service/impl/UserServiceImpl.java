package com.cz.service.impl;

import com.cz.bean.Users;
import com.cz.dao.UserMapper;
import com.cz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(Users user) {
        return userMapper.add(user);
    }

    @Override
    public int update(Users user) {
        return 0;
    }

    @Override
    public int deleteByIds(String[] ids) {
        return 0;
    }

    @Override
    public Users queryLearnResouceById(Long id) {
        return null;
    }

    @Override
    public List<Users> queryLearnResouceList(Map<String, Object> params) {
        return null;
    }
}
