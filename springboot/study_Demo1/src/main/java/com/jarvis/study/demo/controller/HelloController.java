package com.jarvis.study.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateDate: 2020/3/31 14:18
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 14:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("/")
public class HelloController {


    /*
     * 读取配置文件
     *
     * */

    //1.第一种方式:注入配置
    @Autowired
    private Environment env;


    //2.注入配置
    @Value("${server.port}")
    private String port;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getpro1")
    public String getpro1(){
        return env.getProperty("server.port");
    }

    @GetMapping("/getpro2")
    public String getpro2(){
        return port;
    }

}
