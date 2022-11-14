package com.inev1te.study.designpattern.structure.bridge;

import com.inev1te.study.designpattern.structure.bridge.colors.Black;
import com.inev1te.study.designpattern.structure.bridge.colors.Color;
import com.inev1te.study.designpattern.structure.bridge.colors.Red;
import com.inev1te.study.designpattern.structure.bridge.shapes.Square;
import com.inev1te.study.designpattern.structure.bridge.shapes.Triangle;

/**
 * 在一个抽象类中注入另外一个接口，组合各自的实现方法
 * 适用于多种不同抽象的实现需要组合在一个结构中的场景
 */
public class BridgeTest {

    public static void main(String[] args) {
        Color red1 = new Red(new Square());
        Color red2 = new Red(new Triangle());
        Color black1 = new Black(new Square());
        Color black2 = new Black(new Triangle());
        red1.fillShape();
        red2.fillShape();
        black1.fillShape();
        black2.fillShape();
    }
}
