package com.taotao3.www.controller;

import com.taotao3.www.service.impl.BaseServiceInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YM10095 on 2018/3/22.
 */
@RestController
@RequestMapping("/hello")
public class IndexController {


    @Autowired
    private BaseServiceInterfaceImpl dbConfigServiceImpl;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String getString(){
        return dbConfigServiceImpl.add();
    }
}
