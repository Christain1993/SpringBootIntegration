package com.bus365.root.dao;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bus365.root.model.User;

public interface UserDao extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {
}
