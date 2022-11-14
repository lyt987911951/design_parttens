package com.inev1te.study.designpattern.behavioral.observer;

public class MyObserver2 implements Observer{
    @Override
    public void callback(Event event) {
        System.out.println("myObserver2 is dealing with ".concat(event.getName()));
    }
}
