package com.inev1te.study.designpattern.behavioral.observer;

/**
 * 观察者模式（监听者模式、监听器模式）：有事件源（类，可为抽象类），事件（类，可为抽象类），监听器（接口，抽象响应事件方法）三个组成，
 * 在事件源中保存监听器，提供方法填充监听器，在事件源中发送事件
 */
public class ObserverTest {

    public static void main(String[] args) {
        Observer myObserver1 = new MyObserver1();
        Observer myObserver2 = new MyObserver2();
        Source source = new Source();
        source.add(myObserver1);
        source.add(myObserver2);
        source.act(new Event("myEvent") {
        });
    }
}
