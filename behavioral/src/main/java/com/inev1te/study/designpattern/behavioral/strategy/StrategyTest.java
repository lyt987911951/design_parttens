package com.inev1te.study.designpattern.behavioral.strategy;

/**
 * 策略模式，需要一个上下文，在上下文中通过构造方法或set方法注入具体的策略实现类，
 * 通过上下文中的方法调用策略类的抽象方法
 */
public class StrategyTest {

    public static void main(String[] args) {
        StrategyContext context1 = new StrategyContext(new Strategy1());
        StrategyContext context2 = new StrategyContext(new Strategy2());
        context1.doRealStrategy();
        context2.doRealStrategy();
    }
}
