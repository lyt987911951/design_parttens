package com.inev1te.study.designpattern.structure.bridge.shapes;

import com.inev1te.study.designpattern.structure.bridge.shapes.Shape;

public class Square implements Shape {

    @Override
    public String getMyShape() {
        return "Square";
    }
}
