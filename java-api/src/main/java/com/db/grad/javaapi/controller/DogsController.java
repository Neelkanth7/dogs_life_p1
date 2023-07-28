package com.db.grad.javaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.HttpConstraint;

@RestController
public class DogsController {

  @GetMapping("/status")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }


}
