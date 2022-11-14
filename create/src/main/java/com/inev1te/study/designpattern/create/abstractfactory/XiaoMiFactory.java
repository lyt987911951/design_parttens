package com.inev1te.study.designpattern.create.abstractfactory;

import com.inev1te.study.designpattern.create.model.Computer;
import com.inev1te.study.designpattern.create.model.MiBookAir;
import com.inev1te.study.designpattern.create.model.Phone;
import com.inev1te.study.designpattern.create.model.RedMi;

public class XiaoMiFactory extends AbstractFactory{
    @Override
    public Phone createPhone() {
        return new RedMi();
    }

    @Override
    public Computer createComputer() {
        return new MiBookAir();
    }
}
