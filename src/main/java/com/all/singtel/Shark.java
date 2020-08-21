package com.all.singtel;

import com.all.singtel.util.Constant;

public class Shark extends Fish {

  @Override
  public String size() {
    return "large";
  }

  @Override
  public String color() {
    return "grey";
  }

  public void canEat() {
    System.out.println(Constant.EAT_FISH);
  }
}
