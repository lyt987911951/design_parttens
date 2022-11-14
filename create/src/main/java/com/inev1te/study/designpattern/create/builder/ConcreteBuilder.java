package com.inev1te.study.designpattern.create.builder;

public class ConcreteBuilder extends Model.ModelBuilder{

    @Override
    public Model.ModelBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Model.ModelBuilder sex(String sex) {
        this.sex = sex;
        return this;
    }
}
