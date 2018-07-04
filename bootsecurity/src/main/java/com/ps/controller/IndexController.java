package com.ps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String defaultIndex(){
        return "redirect:index";
    }
    @GetMapping("/index")
    public String redirect2Index(){
        return "index";
    }
}
