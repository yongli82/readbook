package com.nuonuo.readbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangyongli on 27/10/2017.
 */
@Controller
public class IndexController {

    @RequestMapping(path="/")
    @ResponseBody
    public String index(){
        return "This is the index page.";
    }
}
