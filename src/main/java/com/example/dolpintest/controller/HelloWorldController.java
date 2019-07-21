package com.example.dolpintest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HelloWorldController {

  @GetMapping("/")
  public String getCurrentUser() {
    return "hello second jenkins world";
  }
}

