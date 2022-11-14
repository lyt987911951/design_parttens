package com.inev1te.study.designpattern.behavioral.command;

public class ConcreteSender extends Sender{

    public ConcreteSender(Command command) {
        super(command);
    }

    @Override
    void send() {
        super.getCommand().execute();
    }
}
