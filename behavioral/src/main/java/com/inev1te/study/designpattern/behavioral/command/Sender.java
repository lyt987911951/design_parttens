package com.inev1te.study.designpattern.behavioral.command;

public abstract class Sender {

    private Command command;

    public Sender(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    abstract void send();
}
