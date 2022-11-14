package com.inev1te.study.designpattern.behavioral.state;

public class Gear2 implements GearState{
    @Override
    public void gearUp(Bike bike) {
        System.out.println("gear change to gear3");
        bike.setGearState(new Gear3());
    }

    @Override
    public void gearDown(Bike bike) {
        System.out.println("gear change to gear1");
        bike.setGearState(new Gear1());
    }
}
