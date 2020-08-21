package com.all.singtel;

import com.all.singtel.behaviour.Fly;
import com.all.singtel.behaviour.Walk;
import com.all.singtel.util.Constant;

public class Insect extends Animal implements Fly, Walk {
  public void canFly() {
    System.out.println(Constant.FLYING);
  }

  public void canWalk() {
    System.out.println(Constant.WALKING);
  }
}
