package com.inev1te.study.designpattern.structure.decorator;

public class MyDecorator extends Decorator{

    public MyDecorator(OldMethod oldMethod) {
        super(oldMethod);
    }

    @Override
    void betterThing() {
        System.out.println("better one");
    }

}
