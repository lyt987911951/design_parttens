package com.inev1te.study.designpattern.behavioral.vistor.vistors;

import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host1;
import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host2;
import com.inev1te.study.designpattern.behavioral.vistor.hosts.Host3;

public interface Vistor {

    void visit(Host1 host1);

    void visit(Host2 host2);

    void visit(Host3 host3);

}
