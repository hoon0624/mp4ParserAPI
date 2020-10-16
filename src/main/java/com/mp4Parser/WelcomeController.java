package com.mp4Parser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController{
  @RequestMapping("/welcome")
  public String welcome(){
    return "welcome"l;
  }
}
