package com.all.singtel;

import com.all.singtel.behaviour.Fly;

public class Butterfly extends Insect {
  private Insect state = new CaterpillarState();

  public void transform() {
    state = new ButterflyState();
  }

  @Override
  public void canFly() {
    state.canFly();
  }

  @Override
  public void canWalk() {
    state.canWalk();
  }

  private class ButterflyState extends Insect implements Fly {

    @Override
    public void canFly() {
      super.canFly();
    }
  }

  private class CaterpillarState extends Insect implements Fly {

    @Override
    public void canFly() {
      System.out.println("I can't fly");
    }
  }
}
