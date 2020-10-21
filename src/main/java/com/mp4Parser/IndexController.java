package com.mp4Parser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "TEST WORKS?");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Model model) {
        model.addAttribute("message", "New PAGE!!");
        return "next";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("message", "Hello???");
        return "test";
    }

    @RequestMapping("/parse")
    public String parse(Model model) {
        model.addAttribute("message", "Hello???");
        return "parse";
    }
}
