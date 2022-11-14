package com.inev1te.study.designpattern.create.abstractfactory;

import com.inev1te.study.designpattern.create.model.Computer;
import com.inev1te.study.designpattern.create.model.IPhone;
import com.inev1te.study.designpattern.create.model.MacBook;
import com.inev1te.study.designpattern.create.model.Phone;

public class AppleFactory extends AbstractFactory{


    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Computer createComputer() {
        return new MacBook();
    }
}
