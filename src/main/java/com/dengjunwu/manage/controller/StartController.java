package com.dengjunwu.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }

    public ModelAndView list(ModelAndView mv){
        mv.setViewName("list");
        return mv;
    }
}
