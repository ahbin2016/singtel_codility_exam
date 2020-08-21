package com.all.singtel;

import com.all.singtel.util.LanguageEnum;
import com.all.singtel.util.LanguageTranslator;
import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;

public class Rooster extends Chicken {

  SoundHelper soundHelper;
  LanguageEnum languageEnum;

  public Rooster() {
    this.soundHelper = new SoundHelper(SoundEnum.ROOSTER);
  }

  public Rooster(LanguageEnum languageEnum) {
    this.soundHelper = new SoundHelper(SoundEnum.ROOSTER);
    this.languageEnum = languageEnum;
  }

  @Override
  public void callSound() {
    String language = LanguageTranslator.translate(SoundEnum.ROOSTER.getSound(), languageEnum);
    System.out.println(language);
  }
}
