package DesignPattern.AbstractFactory;

public class ArtDecoCoffeeTable implements CoffeeTable{
    @Override
    public void placeItems() {
        System.out.println("Placing items on art deco coffee table");
    }
}
