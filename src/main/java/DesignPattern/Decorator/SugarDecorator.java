package DesignPattern.Decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
