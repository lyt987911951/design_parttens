package com.inev1te.study.designpattern.structure.bridge.colors;

import com.inev1te.study.designpattern.structure.bridge.shapes.Shape;

public abstract class Color {

    private Shape shape;

    public Color(Shape shape) {
        this.shape = shape;
    }

    public String getShapeName(){
        return shape.getMyShape();
    }

    public abstract void fillShape();
}
