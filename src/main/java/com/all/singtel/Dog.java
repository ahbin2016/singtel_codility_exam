package com.all.singtel;

import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Dog extends Mammal {
  public Dog() {
    super(new SoundHelper(SoundEnum.DOG));
  }

  public Dog(SoundHelper soundHelper) {
    super(soundHelper);
  }
}
