package com.example.demo.models;

public class InputObject {

  private String what;
  private int[] numbers;

  public InputObject(String what, int[] number) {
    this.what = what;
    this.numbers = number;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
