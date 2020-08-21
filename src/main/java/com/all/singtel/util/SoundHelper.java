package com.all.singtel.util;

public class SoundHelper {
  private SoundEnum soundEnum;

  public SoundHelper(SoundEnum soundEnum) {
    this.soundEnum = soundEnum;
  }

  public void makeSound() {
    System.out.println(soundEnum.getSound());
  }
}
