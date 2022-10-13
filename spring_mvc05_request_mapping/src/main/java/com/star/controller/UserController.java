package com.star.controller;

import com.star.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/user")
public class UserController {
    @RequestMapping("/bai")
    @ResponseBody
    public String bai() {
        return "{'name','bai'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    //请求参数和形参名不一致,导致封装不成功
    //@RequestParam: 关联 请求参数 名称和 形参 名称
    public String commonParam(
            @RequestParam("username") String name, int age) {
        System.out.println(">>> receive name : " + name);
        System.out.println(">>> receive age : " + age);
        return "{'name':'commonParam'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println(">>> receive pojo : " + user);
        return "{'name':'pojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobby) {
        System.out.println(">>> receive array : " + Arrays.toString(hobby));
        return "{'name':'arrayParam'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(
            @RequestParam List<String> hobby) {
        System.out.println(">>> receive list : " + hobby);
        return "{'name':'listParam'}";
    }

    /*  集合参数: json格式进行返回
            1.导入json坐标
            2.springmvc核心配置类中 添加@EnableWebMvc
            3.形参上添加@RequestBody 将外部传递的json数组数据映射到形参中

        @RequestBody: 将外部传递的json数组数据映射到形参中
     */
    @RequestMapping("/jsonCommonParam")
    @ResponseBody
    public String jsonCommonParam(
            @RequestBody List<String> list) {
        System.out.println(">>> receive jsonCommonParam : " + list);
        return "{'name':'jsonCommonParam'}";
    }

    @RequestMapping("/jsonPojoParam")
    @ResponseBody
    public String jsonPojoParam(
            @RequestBody User user) {
        System.out.println(">>> receive jsonPojo : " + user);
        return "{'name':'jsonPojoParam'}";
    }

    @RequestMapping("/jsonPojoArrayParam")
    @ResponseBody
    public String jsonPojoArrayParam(
            @RequestBody List<User> users) {
        System.out.println(">>> receive jsonPojoArray : " + users);
        return "{'name':'jsonPojoArrayParam'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String jsonPojoArrayParam(
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {
        System.out.println(">>> receive date : " + date);
        return "{'name':'dateParam'}";
    }
}
