package com.inev1te.study.designpattern.behavioral.command;

public class ConcreteCommand implements Command{

    private Executor executor;

    public ConcreteCommand(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void execute() {
        executor.exe();
    }
}
