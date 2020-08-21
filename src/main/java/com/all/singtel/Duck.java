package com.all.singtel;

import com.all.singtel.behaviour.Fly;
import com.all.singtel.behaviour.Swim;
import com.all.singtel.util.Constant;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Duck extends Bird implements Fly, Swim {

  public Duck() {
    super(new SoundHelper(SoundEnum.DUCK));
  }

  public void canFly() {
    System.out.println(Constant.FLYING);
  }

  public void canSwim() {
    System.out.println(Constant.SWIMMING);
  }

  @Override
  public void canWalk() {
    super.canWalk();
  }
}
