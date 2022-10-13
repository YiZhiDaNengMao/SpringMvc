package com.star.controller;

import com.star.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/user")
public class UserController {
    //转发
    @RequestMapping("/forward")
    public String forward() {
        return "forward:bai.jsp";
    }

    //重定向
    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:bai.jsp";
    }

    /*  响应数据
        响应pojo对象
            1.导入json坐标
            2.在springmvc配置类中开启 @EnableWebMvc
            3.方法上添加@ResponseBody注解
            4.数据的封装
     */

    @RequestMapping("/toPojo")
    @ResponseBody
    public User toPojo() {
        User user = new User();
        user.setName("猪霸天");
        user.setAge(7);
        return user;
    }

    @RequestMapping("/toPojoList")
    @ResponseBody
    public List<User> toPojoList() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("猪霸天①",6));
        list.add(new User("猪霸天②",7));
        list.add(new User("猪霸天③",8));
        return list;
    }
}
