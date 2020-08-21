package com.all.singtel;

import com.all.singtel.behaviour.Fly;
import com.all.singtel.behaviour.Swim;
import com.all.singtel.util.Constant;

public class Duck extends Bird implements Fly, Swim {

  public void canFly() {
    System.out.println(Constant.FLYING);
  }

  public void canSwim() {
    System.out.println(Constant.SWIMMING);
  }

  @Override
  public void callSound(String sound) {
    super.callSound(sound);
  }

  @Override
  public void canWalk() {
    super.canWalk();
  }
}
