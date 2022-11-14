package com.inev1te.study.designpattern.create.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Model build = new ConcreteBuilder().sex("male").name("test").build();
    }
}
