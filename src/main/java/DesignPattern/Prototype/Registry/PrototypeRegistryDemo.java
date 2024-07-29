package DesignPattern.Prototype.Registry;

import DesignPattern.Prototype.Shape;

public class PrototypeRegistryDemo {
    public static void main(String[] args) {
        ShapeRegistry cache = new ShapeRegistry();

        Shape shape1 = cache.get("Big red circle");
        Shape shape2 = cache.get("Big red circle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if(shape1!=shape2 && !shape1.equals(shape2)){
            System.out.println("Big red circle objects are not equal");
        }
        else System.out.println("Big red circle objects are equal");

        if(shape2!=shape3 && !shape2.equals(shape3)){
            System.out.println("Big red circle and Medium blue rectangle are not equal");
        }
        else System.out.println("Big red circle and Medium blue rectangle are equal");
    }
}
