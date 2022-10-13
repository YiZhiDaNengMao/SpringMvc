package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/bai")
    public void bai() {
        System.out.println("猪霸天");
    }
}
