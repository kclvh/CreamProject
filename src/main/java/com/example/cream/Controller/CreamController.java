package com.example.cream.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreamController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
