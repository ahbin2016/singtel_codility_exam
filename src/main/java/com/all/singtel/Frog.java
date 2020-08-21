package com.all.singtel;

import com.all.singtel.behaviour.Speak;
import com.all.singtel.behaviour.Swim;
import com.all.singtel.behaviour.Walk;
import com.all.singtel.util.Constant;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Frog extends Animal implements Swim, Speak, Walk {

  private SoundHelper soundHelper;

  public Frog() {
    this.soundHelper = new SoundHelper(SoundEnum.DEFAULT);
  }

  public Frog(SoundHelper soundHelper) {
    this.soundHelper = soundHelper;
  }

  public void callSound() {
    soundHelper.makeSound();
  }

  public void canSwim() {
    System.out.println(Constant.SWIMMING);
  }

  public void canWalk() {
    System.out.println(Constant.WALKING);
  }
}
