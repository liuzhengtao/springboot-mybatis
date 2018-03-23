package com.taotao3.www.service.impl;

import com.taotao3.www.dao.DbConfigMapper;
import com.taotao3.www.entity.DbConfig;
import com.taotao3.www.service.BaseServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by YM10095 on 2018/3/22.
 */
@Service
public class BaseServiceInterfaceImpl implements BaseServiceInterface {
    public Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DbConfigMapper dbConfigMapper;
    @Override
    public void add(DbConfig dbConfig) {
        try{
            dbConfigMapper.add(dbConfig);
            logger.info("添加成功");
        }catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void update(DbConfig dbConfig) {

    }


    @Override
    public void delete(String id) {

    }

    @Override
    public DbConfig get(String id) {
        return null;
    }
}
