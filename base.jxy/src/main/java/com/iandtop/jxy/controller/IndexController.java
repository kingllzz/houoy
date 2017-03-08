package com.iandtop.jxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author andyzhao
 */
//@RestController("/api/login/")
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String signin() {
        return "index";
    }
}


