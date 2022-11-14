package com.inev1te.study.designpattern.behavioral.vistor.hosts;

import com.inev1te.study.designpattern.behavioral.vistor.vistors.Vistor;

public abstract class Host {

    abstract void accept(Vistor vistor);
}
