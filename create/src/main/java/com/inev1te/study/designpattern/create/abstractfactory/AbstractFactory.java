package com.inev1te.study.designpattern.create.abstractfactory;

import com.inev1te.study.designpattern.create.model.Computer;
import com.inev1te.study.designpattern.create.model.Phone;

/**
 * 抽象工厂模式：工厂对生产的产品各自抽象方法，各自工厂子类生产各自产品
 */
public abstract class AbstractFactory {

    public abstract Phone createPhone();

    public abstract Computer createComputer();
}
