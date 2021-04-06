package com.calebwheeler.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Cross Origin added to prevent CORS issues
@RestController
@CrossOrigin
public class HomeController {
  
  @GetMapping("/")
  public String home() {
    return "index";
  }
}
