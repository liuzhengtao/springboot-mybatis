package com.example.demo.controller;

import com.example.demo.service.DbConfigService;
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
    private DbConfigService dbConfigService;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String getString(){
        return dbConfigService.add();
    }
}
