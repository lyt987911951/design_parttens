package com.inev1te.study.designpattern.behavioral.state;

public class Gear1 implements GearState{
    @Override
    public void gearUp(Bike bike) {
        System.out.println("gear change to gear2");
        bike.setGearState(new Gear2());
    }

    @Override
    public void gearDown(Bike bike) {
        throw new RuntimeException("not support!");
    }
}
