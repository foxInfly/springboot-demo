package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SController {


    /**
     * k8s测试
     * @author lp
     * @since 2021/1/14 18:10
     **/
    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s <br/>1233 ";
    }
}
