package com.bbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BbsApplication extends SpringBootServletInitializer {
    //修改入口方法 继承一个SpringBootServletInitializer类，并且覆盖configure方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BbsApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BbsApplication.class, args);
    }
}
