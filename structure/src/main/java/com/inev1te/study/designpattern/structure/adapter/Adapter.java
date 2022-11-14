package com.inev1te.study.designpattern.structure.adapter;

public class Adapter extends Adaptee implements TargetInterface{
    @Override
    public void doSomethingNew() {
        System.out.println("do something new!");
    }
}
