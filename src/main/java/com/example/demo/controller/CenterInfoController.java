package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterInfoController {
  @RequestMapping("/centerInfo")
  public String a(){
      return "centerInfo";
  }
}
