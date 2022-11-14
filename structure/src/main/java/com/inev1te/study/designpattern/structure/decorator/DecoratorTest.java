package com.inev1te.study.designpattern.structure.decorator;

/**
 * 装饰类为抽象类，实现需要被增强的接口，抽象方法增强接口方法并重写接口方法，抽象子类完成具体增强逻辑
 */
public class DecoratorTest {
    public static void main(String[] args) {
        MyDecorator myDecorator = new MyDecorator(new OldMethodImpl1());
        MyDecorator myDecorator1 = new MyDecorator(new OldMethodImpl2());
//        myDecorator.doSomething();
        myDecorator.doBetter();
//        myDecorator1.doSomething();
        myDecorator1.doBetter();
    }

}
