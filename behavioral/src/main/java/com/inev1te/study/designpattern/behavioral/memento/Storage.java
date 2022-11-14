package com.inev1te.study.designpattern.behavioral.memento;

public class Storage {

    private Memo memo;

    public Storage(Memo memo) {
        this.memo = memo;
    }

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }
}
