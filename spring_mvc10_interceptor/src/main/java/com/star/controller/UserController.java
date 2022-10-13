package com.star.controller;

import com.star.pojo.User;
import org.springframework.web.bind.annotation.*;

/*@Controller
@ResponseBody*/
//使用RestController简化 @Controller + @ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping
    public String save(@RequestBody User user) {
        System.out.println("save ..." + user);
        return "{'module':'user save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("delete..." + id);
        return "{'module':'user delete'}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("update ..." + user);
        return "{'module':'user update'}";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id) {
        System.out.println("findById ..." + id);
        return "{'module':'user findById'}";
    }

    @GetMapping
    public String findAll() {
        System.out.println("findAll ...");
        return "{'module':'user findAll'}";
    }
}
