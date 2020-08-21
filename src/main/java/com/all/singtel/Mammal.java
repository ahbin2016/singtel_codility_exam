package com.all.singtel;

import com.all.singtel.behaviour.Speak;
import com.all.singtel.behaviour.Walk;
import com.all.singtel.util.Constant;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Mammal extends Animal implements Walk, Speak {

  private SoundHelper soundHelper;

  public Mammal() {
    this.soundHelper = new SoundHelper(SoundEnum.DEFAULT);
  }

  public Mammal(SoundHelper soundHelper) {
    this.soundHelper = soundHelper;
  }

  public void callSound() {
    soundHelper.makeSound();
  }

  public void canWalk() {
    System.out.println(Constant.WALKING);
  }
}
