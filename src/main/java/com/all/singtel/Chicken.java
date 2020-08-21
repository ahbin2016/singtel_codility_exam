package com.all.singtel;

import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Chicken extends Bird {

  public Chicken() {
    super(new SoundHelper(SoundEnum.CHICKEN));
  }

  public Chicken(SoundHelper soundHelper) {
    super(soundHelper);
  }

  @Override
  public void canWalk() {
    super.canWalk();
  }
}
