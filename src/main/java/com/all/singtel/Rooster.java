package com.all.singtel;

import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Rooster extends Chicken {
  public Rooster() {
    super(new SoundHelper(SoundEnum.ROOSTER));
  }
}
