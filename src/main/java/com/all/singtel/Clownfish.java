package com.all.singtel;

import com.all.singtel.util.Constant;

public class Clownfish extends Fish {

    @Override
    public String size() {
        return "small";
    }

    @Override
    public String color() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(Constant.JOKES);
    }
}
