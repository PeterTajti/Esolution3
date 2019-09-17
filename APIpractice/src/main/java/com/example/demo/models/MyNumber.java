package com.example.demo.models;

public class MyNumber {

  private int received;
  private int result;

  public MyNumber() {}

  public MyNumber(int recieved) {
    this.received = recieved;
    this.result = recieved * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
