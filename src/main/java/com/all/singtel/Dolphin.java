package com.all.singtel;

import com.all.singtel.behaviour.Swim;
import com.all.singtel.util.Constant;

public class Dolphin extends Animal implements Swim {
    public void canSwim() {
    System.out.println(Constant.SWIMMING);
    }
}
