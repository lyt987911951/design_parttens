package com.inev1te.study.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Source {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void act(Event event){
        observers.forEach(observer -> {
            observer.callback(event);
        });
    }

}
