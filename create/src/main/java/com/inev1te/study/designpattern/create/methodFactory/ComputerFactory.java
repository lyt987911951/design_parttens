package com.inev1te.study.designpattern.create.methodFactory;

import com.inev1te.study.designpattern.create.model.Computer;
import com.inev1te.study.designpattern.create.model.Product;

public class ComputerFactory extends MethodFactory {
    @Override
    public Product getInstance() {
        return new Computer();
    }
}
