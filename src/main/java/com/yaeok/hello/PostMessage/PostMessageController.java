package com.yaeok.hello.PostMessage;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMessageController {

  @RequestMapping("/api/v1/postmessage")
  @CrossOrigin(origins = "*")
  public PostMessageModel doPost(@RequestBody PostMessageModel postMessage) {
    String getMessage = postMessage.getMessage() != "" ? postMessage.getMessage() : "";
    String getUsername = postMessage.getUsername() != "" ? postMessage.getUsername() : "";
    String getEmail = postMessage.getEmail() != "" ? postMessage.getEmail() : "";

    PostMessageModel changeMessage = new PostMessageModel();
    changeMessage.setMessage(getMessage + "post message test");
    changeMessage.setUsername(getUsername + "yaeo kohei");
    changeMessage.setEmail(getEmail + "yaeok@revolveok.com");
    return changeMessage;
  }
}
