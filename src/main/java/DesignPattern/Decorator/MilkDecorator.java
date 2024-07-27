package DesignPattern.Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

    @Override
    public String description() {
        return super.description() + ", milk";
    }
}
