package com.all.singtel;

import com.all.singtel.behaviour.Speak;
import com.all.singtel.behaviour.Walk;
import com.all.singtel.util.Constant;

public class Bird extends Animal implements Walk, Speak {

  public void callSound(String sound) {
    System.out.println(sound);
  }

  public void canWalk() {
    System.out.println(Constant.WALKING);
  }
}
