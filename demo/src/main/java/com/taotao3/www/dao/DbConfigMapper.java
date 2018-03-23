package com.taotao3.www.dao;

import com.taotao3.www.entity.DbConfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by YM10095 on 2018/3/22.
 */
public interface DbConfigMapper{
    public  void add(DbConfig dbConfig);
    public  void update(DbConfig dbConfig);
    public  void delete(String id);
    public  DbConfig get(String id);
}
