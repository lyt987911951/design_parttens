package com.inev1te.study.designpattern.behavioral.strategy;

public class StrategyContext {

    private AbstractStrategy strategy;

    public StrategyContext(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void doRealStrategy(){
        strategy.doStrategy();
    }
}
