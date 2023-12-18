package com.posco.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
@Repository
public interface UserMapper {

    ArrayList<HashMap<String, Object>> findAll();

    ArrayList<HashMap<String, Object>> findName();
}