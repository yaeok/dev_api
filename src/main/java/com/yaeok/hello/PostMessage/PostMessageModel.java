package com.yaeok.hello.PostMessage;

public class PostMessageModel {
  private String message;
  private String username;
  private String email;

  public String getMessage() {
    return message;
  }

  void setMessage(String message) {
    this.message = message;
  }

  public String getUsername() {
    return username;
  }

  void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  void setEmail(String email) {
    this.email = email;
  }
}
