package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

//@Component
public class MyErrorMsg {


  @JsonProperty("error")
  public String messageText;

  public MyErrorMsg() {
  }

  public MyErrorMsg(String errorMessageText) {
    messageText = errorMessageText;
  }

  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }
}
