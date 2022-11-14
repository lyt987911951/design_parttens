package com.inev1te.study.designpattern.behavioral.interpret;

public class MyInterpretor2 implements Interpretor{
    @Override
    public void interpret(Context context) {
        System.out.println(context.getMyObject1().equals(context.getMyObject2()));
    }
}
