package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/bai")
    @ResponseBody
    public String bai() {
            return "{'name','jiang'}";
    }
}
