package com.hymnbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(path = {"","/index","index.html"})
    public String defaultLandingPage(){
        return "index";
    }
}
