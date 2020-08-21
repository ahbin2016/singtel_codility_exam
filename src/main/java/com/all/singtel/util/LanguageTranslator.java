package com.all.singtel.util;

public class LanguageTranslator {

  private LanguageTranslator() {}

  public static String translate(String sound, LanguageEnum languageEnum) {

    if (languageEnum == null || !sound.equals(SoundEnum.ROOSTER.getSound())) {
      return sound;
    }

    switch (languageEnum) {
      case DANISH:
        return LanguageEnum.DANISH.getLanguage();
      case DUTCH:
        return LanguageEnum.DUTCH.getLanguage();
      case FINNISH:
        return LanguageEnum.FINNISH.getLanguage();
      case FRENCH:
        return LanguageEnum.FRENCH.getLanguage();
      case GERMAN:
        return LanguageEnum.GERMAN.getLanguage();
      case GREEK:
        return LanguageEnum.GREEK.getLanguage();
      case HEBREW:
        return LanguageEnum.HEBREW.getLanguage();
      case HUNGARIAN:
        return LanguageEnum.HUNGARIAN.getLanguage();
      case ITALIAN:
        return LanguageEnum.ITALIAN.getLanguage();
      case JAPANESE:
        return LanguageEnum.JAPANESE.getLanguage();
      case PORTUGUESE:
        return LanguageEnum.PORTUGUESE.getLanguage();
      case RUSSIAN:
        return LanguageEnum.RUSSIAN.getLanguage();
      case SWEDISH:
        return LanguageEnum.SWEDISH.getLanguage();
      case TURKISH:
        return LanguageEnum.TURKISH.getLanguage();
      case URDU:
        return LanguageEnum.URDU.getLanguage();
      default:
        return sound;
    }
  }
}
