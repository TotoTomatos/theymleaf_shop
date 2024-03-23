package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopContorller {
  @RequestMapping("/shop")
  public String shop() {
    return "shop";
  }
}
