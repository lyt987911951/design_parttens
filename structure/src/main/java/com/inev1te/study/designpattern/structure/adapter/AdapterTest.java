package com.inev1te.study.designpattern.structure.adapter;

/**
 * 类适配器：使用接口描述新功能方法，适配器类实现新接口并继承旧接口，调用适配器类方法即可
 * 口诀：继承旧接口，实现新接口
 */
public class AdapterTest {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.doSomethingNew();
        adapter.doSomethingOld();
    }
}
