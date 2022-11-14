package com.inev1te.study.designpattern.structure.flyweight;

import com.inev1te.study.designpattern.structure.bridge.colors.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {

    private static Map<Color, Color> map = new HashMap<>();

    public static Color getColor(Color color){
        if (map.containsKey(color)){
            return map.get(color);
        }else {
            map.put(color,color);
            return color;
        }
    }
}
