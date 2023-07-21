package com.yaeok.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplicationController {

  @RequestMapping("/api")
  @CrossOrigin(origins = "*")
  public HelloModel test() {
    HelloModel hello = new HelloModel();
    hello.setMessage("Hello World!");
    hello.setName("Yaeok Jeong");
    hello.setEmail("test@test.com");
    return hello;
  }
}
