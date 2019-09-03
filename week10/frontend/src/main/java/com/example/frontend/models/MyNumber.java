package com.example.frontend.models;

public class MyNumber {

  private Integer received;
  private Integer result;

  public MyNumber() {
  }

  public MyNumber(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
