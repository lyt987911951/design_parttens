package com.inev1te.study.designpattern.behavioral.interpret;

public class MyInterpretor1 implements Interpretor{
    @Override
    public void interpret(Context context) {
        System.out.println(context.getMyObject1().toString().concat(context.getMyObject2().toString()));
    }
}
