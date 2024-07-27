package DesignPattern.Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.description() + " $" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.description() + " $" + milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.description() + " $" + milkSugarCoffee.cost());
    }
}
