package com.inev1te.study.designpattern.create.builder;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 使用builder类，抽象构造各个属性的方法,实现抽象方法，
 */
@Data
@Accessors(chain = true)
public class Model {

    private String name;

    private String sex;

    public static abstract class ModelBuilder{

        protected String name;

        protected String sex;

        public abstract ModelBuilder name(String name);

        public abstract ModelBuilder sex(String sex);

        public Model build(){
            return new Model().setName(this.name).setSex(this.sex);
        }
    }
}


