package com.myfoxclub.myfox.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FoxPack {

  List<Fox> foxList;

  public FoxPack() {
    foxList = new ArrayList<>();
    fillList();
  }


  Fox fox1 = new Fox("Karak","salad", "water");


  public List<Fox> getFoxList() {return foxList;
  }

  public void fillList () {
   foxList.add(fox1);
  }

}
