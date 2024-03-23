package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class DetailController {
  @RequestMapping("/detail")
  public String a(){
      return "detail";
  }
}
