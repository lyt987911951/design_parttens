package com.inev1te.study.designpattern.create.model;

import lombok.Data;

@Data
public class Product {

    private String name;

    public void getProductName(){
        System.out.println("product is : "+this.getClass().getName());
    }

}
