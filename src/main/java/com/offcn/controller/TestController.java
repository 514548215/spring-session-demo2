package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","hello");
        return "ok";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }

    /**
     * 分支2新增方法测试
     */

    public void fenzhi2(){
        System.out.println("分支19新增方法测试");
    }


}
