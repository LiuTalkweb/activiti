package com.gcloud.activitidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoCtroller {

    @RequestMapping("/home")
    String home(HttpServletRequest request) {
        String userName = "Jef";
        int count = 100;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }

    @RequestMapping("/secordPage")
    String secordPage(HttpServletRequest request) {
        String userName = "Rubber";
        int count = 100;
        return "secordPage 欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }
}
