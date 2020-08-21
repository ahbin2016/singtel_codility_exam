package com.all.singtel;

import com.all.singtel.behaviour.Speak;
import com.all.singtel.behaviour.Walk;
import com.all.singtel.util.Constant;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Bird extends Animal implements Walk, Speak {

  private SoundHelper soundHelper;

  public Bird() {
    this.soundHelper = new SoundHelper(SoundEnum.DEFAULT);
  }

  public Bird(SoundHelper soundHelper) {
    this.soundHelper = soundHelper;
  }

  public void callSound() {
    soundHelper.makeSound();
  }

  public void canWalk() {
    System.out.println(Constant.WALKING);
  }
}
