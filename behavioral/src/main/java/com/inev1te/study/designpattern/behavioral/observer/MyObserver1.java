package com.inev1te.study.designpattern.behavioral.observer;

public class MyObserver1 implements Observer{
    @Override
    public void callback(Event event) {
        System.out.println("myObserver1 is dealing with ".concat(event.getName()));
    }
}
