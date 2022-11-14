package com.inev1te.study.designpattern.behavioral.observer;

public abstract class Event {

    private String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
