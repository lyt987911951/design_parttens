package com.inev1te.study.designpattern.create.singleton;

import com.inev1te.study.designpattern.create.model.Product;

public class LazySingleton {

    private static Product singleton = new Product();

    public static Product getSingleton(){
        return singleton;
    }
}
