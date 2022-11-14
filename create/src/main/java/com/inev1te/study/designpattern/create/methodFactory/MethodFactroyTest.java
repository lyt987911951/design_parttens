package com.inev1te.study.designpattern.create.methodFactory;

import com.inev1te.study.designpattern.create.model.Product;

public class MethodFactroyTest {
    public static void main(String[] args) {
        MethodFactory computerFactory = new ComputerFactory();
        Product instance = computerFactory.getInstance();
        instance.getProductName();
    }
}
