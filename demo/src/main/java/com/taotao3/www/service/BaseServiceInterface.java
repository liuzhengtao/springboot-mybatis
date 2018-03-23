package com.taotao3.www.service;

import com.taotao3.www.entity.DbConfig;

/**
 * Created by YM10095 on 2018/3/23.
 */
public interface BaseServiceInterface {
    public  void add(DbConfig dbConfig);
    public  void update(DbConfig dbConfig);
    public  void delete(String id);
    public  DbConfig get(String id);
}
