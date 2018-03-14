package com.cz.dao;

import com.cz.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Users,Integer> {

}
