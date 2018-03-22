package com.example.demo.dao;

import com.example.demo.entity.DbConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * Created by YM10095 on 2018/3/22.
 */
@Mapper
public interface DbConfigMapper {
    void add(DbConfig dbConfig);
    void update(DbConfig dbConfig);
    void delete(String id);
    DbConfig get(String id);
}
