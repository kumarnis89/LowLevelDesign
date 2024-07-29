package DesignPattern.Prototype.Registry;

import DesignPattern.Prototype.Circle;
import DesignPattern.Prototype.Rectangle;
import DesignPattern.Prototype.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> cache = new HashMap<>();

    public ShapeRegistry(){
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        cache.put("Big red circle",circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        cache.put("Medium blue rectangle",rectangle);
    }

    public Shape put(String key, Shape shape){
        cache.put(key,shape);
        return shape;
    }

    public Shape get(String key){
        return cache.get(key).clone();
    }
}
