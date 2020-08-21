package com.all.singtel;

import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Cat extends Mammal {
  public Cat() {
    super(new SoundHelper(SoundEnum.CAT));
  }

  public Cat(SoundHelper soundHelper) {
    super(soundHelper);
  }
}
