package com.example.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping("/coach")



@Controller
@AllArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String idxPage(){
        return "index";
    }
}
