package com.inev1te.study.designpattern.create.methodFactory;

import com.inev1te.study.designpattern.create.model.Product;

/**
 * 方法工厂模式：把工厂的获取生产方法抽象，子工厂实现各自产品
 */
public abstract class MethodFactory {

    public abstract Product getInstance();

}
