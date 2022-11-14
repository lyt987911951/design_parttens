package com.inev1te.study.designpattern.behavioral.vistor.hosts;

import com.inev1te.study.designpattern.behavioral.vistor.vistors.Vistor;

public class Host1 extends Host{

    public void accept(Vistor vistor){
        vistor.visit(this);
    }
}
