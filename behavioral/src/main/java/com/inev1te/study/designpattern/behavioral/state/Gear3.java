package com.inev1te.study.designpattern.behavioral.state;

public class Gear3 implements GearState{
    @Override
    public void gearUp(Bike bike) {
        throw new RuntimeException("not support!");
    }

    @Override
    public void gearDown(Bike bike) {
        System.out.println("gear change to gear2");
        bike.setGearState(new Gear2());
    }
}
