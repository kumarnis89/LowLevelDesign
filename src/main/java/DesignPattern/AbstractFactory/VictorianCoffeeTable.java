package DesignPattern.AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void placeItems() {
        System.out.println("Placing items on victorian coffee table");
    }
}
