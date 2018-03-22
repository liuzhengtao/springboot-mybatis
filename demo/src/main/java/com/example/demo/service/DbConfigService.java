package com.example.demo.service;

import com.example.demo.dao.DbConfigMapper;
import com.example.demo.entity.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by YM10095 on 2018/3/22.
 */
@Service
public class DbConfigService {

    @Autowired
    private DbConfigMapper dbConfigMapper;

    public String add(){
        try{
            DbConfig dbConfig = new DbConfig();
            dbConfig.setIp("172.16.230.121");
            dbConfig.setMysqlPort("3306");
            dbConfig.setPassWd("root");
            dbConfig.setUserName("root");
            dbConfig.setDbName("bms");
            dbConfigMapper.add(dbConfig);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
           return "error";
        }

    }
}
