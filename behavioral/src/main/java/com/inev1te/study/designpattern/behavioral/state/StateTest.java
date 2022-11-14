package com.inev1te.study.designpattern.behavioral.state;

/**
 * 状态模式：状态模式的类图与策略模式一致，但是状态模式的重点在于状态的转换，即在调用具体状态子类的方法中，
 * 应该包含上下文中状态类的切换操作，以此来切换状态
 */
public class StateTest {

    public static void main(String[] args) {
        Bike bike = new Bike(new Gear1());
        bike.gearUp();
        bike.gearUp();
        bike.gearDown();
    }
}
