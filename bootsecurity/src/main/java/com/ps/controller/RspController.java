package com.ps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RspController {
    @GetMapping("/ps")
    public String check(){
        return "Hello --- Security";
    }
}
