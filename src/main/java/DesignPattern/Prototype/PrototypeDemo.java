package DesignPattern.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Circle anotherCircle = (Circle) circle.clone();
        System.out.println(circle==anotherCircle);
        System.out.println(circle.equals(anotherCircle));

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        Rectangle anotherRect = (Rectangle) rectangle.clone();
        System.out.println(rectangle==anotherRect);
        System.out.println(rectangle.equals(anotherRect));
    }
}
