package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "time-line";
    }
    @GetMapping("/admin")
    public String home(){
        return "notifications";
    }

    @GetMapping("/user")
    public String facebook(){
        return "facebook";
    }

    @GetMapping("/admin/detail")
    public String detail(){
        return "home";
    }


    @GetMapping("/page403")
    public String khongcoquyen(){
        return "khongcoquyen";
    }
}
