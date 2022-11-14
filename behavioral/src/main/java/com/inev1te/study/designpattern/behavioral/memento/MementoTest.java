package com.inev1te.study.designpattern.behavioral.memento;

/**
 * 备忘录模式（备份模式）：原始对象，备份对象（可以继承原始对象，并定义备份方法，即需要备份字段值的复制方法）
 * 和容器（注入备份对象）
 */
public class MementoTest {

    public static void main(String[] args) {
        Original myBean = new Original("myBean", 14, true);
        Storage storage = new Storage(myBean.createMemo());
        myBean.setName("test");
        myBean.setAge(8);
        myBean.setSex(false);
        System.out.println(myBean.toString());
        myBean.restoreMemo(storage.getMemo());
        System.out.println(myBean.toString());
    }
}
