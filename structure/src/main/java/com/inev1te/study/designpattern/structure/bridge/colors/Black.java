package com.inev1te.study.designpattern.structure.bridge.colors;

import com.inev1te.study.designpattern.structure.bridge.shapes.Shape;

public class Black extends Color{

    public Black(Shape shape) {
        super(shape);
    }

    @Override
    public void fillShape() {
        System.out.println("i am a ".concat(getShapeName()).concat(" with ").concat("black"));
    }
}
