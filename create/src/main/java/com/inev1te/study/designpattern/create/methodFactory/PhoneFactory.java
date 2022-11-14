package com.inev1te.study.designpattern.create.methodFactory;

import com.inev1te.study.designpattern.create.model.Phone;
import com.inev1te.study.designpattern.create.model.Product;

public class PhoneFactory extends MethodFactory {

    @Override
    public Product getInstance() {
        return new Phone();
    }
}
