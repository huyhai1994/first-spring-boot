package com.codegym.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/greeting")
    public String showGreeting() {
        return "greeting";
    }
}
