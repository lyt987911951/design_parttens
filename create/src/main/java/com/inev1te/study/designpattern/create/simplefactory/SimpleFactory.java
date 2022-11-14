package com.inev1te.study.designpattern.create.simplefactory;

import com.inev1te.study.designpattern.create.model.Computer;
import com.inev1te.study.designpattern.create.model.Phone;
import com.inev1te.study.designpattern.create.model.Product;

/**
 * 简单工厂模式，根据输入参数判断返回对应实例
 */
public class SimpleFactory {

    public static Product getInstance(String type){
        if (type.equals("phone")){
            return new Phone();
        } else if (type.equals("computer")) {
            return new Computer();
        }else {
            return new Product();
        }
    }
}
