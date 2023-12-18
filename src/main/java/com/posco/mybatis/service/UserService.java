package com.posco.mybatis.service;

import com.posco.mybatis.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return userMapper.findAll();
    }

    public ArrayList<HashMap<String, Object>> findName() {
        return userMapper.findName();
    }
}