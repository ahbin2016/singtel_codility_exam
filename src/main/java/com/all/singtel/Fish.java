package com.all.singtel;

import com.all.singtel.behaviour.Appearance;
import com.all.singtel.behaviour.Swim;
import com.all.singtel.util.Constant;

public class Fish extends Animal implements Swim ,Appearance {
  public void canSwim() {
    System.out.println(Constant.SWIMMING);
  }

  public String size() {
    return "";
  }

  public String color() {
    return "";
  }
}
