package com.all.singtel.util;

import com.all.singtel.Animal;
import com.all.singtel.behaviour.Fly;
import com.all.singtel.behaviour.Speak;
import com.all.singtel.behaviour.Swim;
import com.all.singtel.behaviour.Walk;

public class AnimalCount {
  Animal[] animals;
  public int flyingAnimal = 0;
  public int walkingAnimal = 0;
  public int speakingAnimal = 0;
  public int swimmingAnimal = 0;

  public AnimalCount(Animal[] animals) {
    this.animals = animals;
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] instanceof Fly) {
        flyingAnimal += 1;
      }
      if (animals[i] instanceof Walk) {
        walkingAnimal += 1;
      }
      if (animals[i] instanceof Speak) {
        speakingAnimal += 1;
      }
      if (animals[i] instanceof Swim) {
        swimmingAnimal += 1;
      }
    }
  }
}
