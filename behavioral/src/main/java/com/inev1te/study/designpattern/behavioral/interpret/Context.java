package com.inev1te.study.designpattern.behavioral.interpret;

public class Context {

    private MyObject1 myObject1;

    private MyObject2 myObject2;

    public Context(MyObject1 myObject1, MyObject2 myObject2) {
        this.myObject1 = myObject1;
        this.myObject2 = myObject2;
    }

    public MyObject1 getMyObject1() {
        return myObject1;
    }

    public void setMyObject1(MyObject1 myObject1) {
        this.myObject1 = myObject1;
    }

    public MyObject2 getMyObject2() {
        return myObject2;
    }

    public void setMyObject2(MyObject2 myObject2) {
        this.myObject2 = myObject2;
    }
}
