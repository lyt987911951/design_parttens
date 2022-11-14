package com.inev1te.study.designpattern.behavioral.vistor.vistors;

import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host1;
import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host2;
import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host3;

public class Visitor1 implements Vistor{
    @Override
    public void visit(Host1 host1) {
        System.out.println("visit1 visit host1");
    }

    @Override
    public void visit(Host2 host2) {
        System.out.println("visit1 visit host2");
    }

    @Override
    public void visit(Host3 host3) {
        System.out.println("visit1 visit host3");
    }
}
