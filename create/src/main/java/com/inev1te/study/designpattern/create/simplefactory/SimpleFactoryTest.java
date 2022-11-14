package com.inev1te.study.designpattern.create.simplefactory;

import com.inev1te.study.designpattern.create.model.Product;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product phone = SimpleFactory.getInstance("phone");
        Product computer = SimpleFactory.getInstance("computer");
    }
}
