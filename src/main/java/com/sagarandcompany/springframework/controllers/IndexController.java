package com.sagarandcompany.springframework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index() {
        return "index";
    }

    @GetMapping("/docs/api")
    String swagger() {
        return "redirect:/swagger-ui.html";
    }
}
