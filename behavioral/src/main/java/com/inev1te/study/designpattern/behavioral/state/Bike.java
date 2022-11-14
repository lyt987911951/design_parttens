package com.inev1te.study.designpattern.behavioral.state;

/**
 * 自行车，即上下文，状态的载体
 */
public class Bike {

    private GearState gearState;

    public Bike(GearState gearState) {
        this.gearState = gearState;
    }

    public GearState getGearState() {
        return gearState;
    }

    public void setGearState(GearState gearState) {
        this.gearState = gearState;
    }

    public void gearUp(){
        this.getGearState().gearUp(this);
    }

    public void gearDown(){
        this.getGearState().gearDown(this);
    }
}
