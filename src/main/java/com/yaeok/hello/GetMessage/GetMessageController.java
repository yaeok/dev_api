package com.yaeok.hello.GetMessage;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageController {

  @RequestMapping("/api/v1/getmessage")
  @CrossOrigin(origins = "*")
  public GetMessageModel doGet() {
    GetMessageModel postMessage = new GetMessageModel();
    postMessage.setMessage("get message test");
    postMessage.setUsername("getter kohei");
    postMessage.setEmail("getter@revolveok.com");
    return postMessage;
  }
}
