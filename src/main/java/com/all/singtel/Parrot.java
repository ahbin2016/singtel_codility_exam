package com.all.singtel;

import com.all.singtel.behaviour.Fly;
import com.all.singtel.util.Constant;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Parrot extends Bird implements Fly {

  public void canFly() {
    System.out.println(Constant.FLYING);
  }

  public Parrot() {
    super(new SoundHelper(SoundEnum.DEFAULT));
  }

  public Parrot(SoundHelper soundHelper) {
    super(soundHelper);
  }
}
