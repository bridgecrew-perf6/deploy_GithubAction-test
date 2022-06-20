package com.codestates.deploywithGithubAction.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Value("${bebootcamp}")
  private String be;

  @Value("${febootcamp}")
  private String fe;

  @GetMapping("/")
  public String hello () {
    return "Hello World!" + be + "and " + fe;
  }

  @GetMapping("/bye")
  public String bye () {
    return "Bye Bye!";
  }
}
