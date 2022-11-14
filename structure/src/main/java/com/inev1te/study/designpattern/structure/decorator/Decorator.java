package com.inev1te.study.designpattern.structure.decorator;

public abstract class Decorator implements OldMethod{

    private OldMethod oldMethod;

    public Decorator(OldMethod oldMethod) {
        this.oldMethod = oldMethod;
    }

    @Override
    public void doSomething(){
        oldMethod.doSomething();
    }

    void doBetter(){
        //这里定义增强逻辑
        betterThing();
        this.doSomething();
    }

    abstract void betterThing();
}
