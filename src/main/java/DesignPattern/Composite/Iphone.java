package DesignPattern.Composite;

public class Iphone implements Item{
    @Override
    public double cost() {
        return 1500.0;
    }

    @Override
    public String description() {
        return "iPhone 15 pro max";
    }
}
