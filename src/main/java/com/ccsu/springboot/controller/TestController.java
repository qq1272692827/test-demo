package com.ccsu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description
 * @date 2019/3/6
 */
@RestController
public class TestController {



    @RequestMapping("/testWar")
    public String test(){
        return "hello: testWar";
    }


}
