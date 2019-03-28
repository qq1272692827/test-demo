package com.ccsu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author wenzhenyu
 * @description 应用启动
 * @date 2019/3/6
 */
@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer {

    public static void main(String[]args){
        SpringApplication.run(SpringBootDemoApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDemoApplication.class);
    }

}
