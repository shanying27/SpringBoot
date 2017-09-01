package com.dc.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenxye on 2017/8/21.
 */
@RestController
public class UserContrller {

    @RequestMapping("/dc")
    public String stat(){
        return "国庆节快乐！！！！";
    }
}
