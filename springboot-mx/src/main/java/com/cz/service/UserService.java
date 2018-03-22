package com.cz.service;

import com.cz.bean.Users;

import java.util.List;
import java.util.Map;

public interface UserService {
    int add(Users user);
    int update(Users user);
    int deleteByIds(String[] ids);
    Users queryLearnResouceById(Long id);
    public List<Users> queryLearnResouceList(Map<String, Object> params);
}
