package com.betacat.zjkb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"/","/index","/front/index"})
    public String goIndex(){
        return "/front/index";
    }

    @RequestMapping("/front/about")
    public String goAbout(){
        return "/front/about";
    }

    @RequestMapping("/front/qualifications")
    public String goQualifications(){
        return "/front/qualifications";
    }

    @RequestMapping("/front/works")
    public String goWorks(){
        return "/front/works";
    }

    @RequestMapping("/front/recruit")
    public String goRecruit(){
        return "/front/recruit";
    }

    @RequestMapping("/front/contact")
    public String goContact(){
        return "/front/contact";
    }

}
