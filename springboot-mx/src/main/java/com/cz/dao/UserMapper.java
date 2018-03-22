package com.cz.dao;

import com.cz.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    int add(Users user);
    int update(Users user);
    int deleteByIds(String[] ids);
    Users queryLearnResouceById(Long id);
    public List<Users> queryLearnResouceList(Map<String, Object> params);
}
