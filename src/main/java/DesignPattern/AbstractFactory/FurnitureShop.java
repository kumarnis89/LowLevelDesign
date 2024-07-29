package DesignPattern.AbstractFactory;

public class FurnitureShop {
    private FurnitureFactory furnitureFactory;

    public FurnitureShop(FurnitureFactory factory){
        this.furnitureFactory = factory;
    }

    public void createChair(){
        Chair chair =  furnitureFactory.createChair();
        chair.sitOn();
    }

    public void createSofa(){
        Sofa sofa = furnitureFactory.createSofa();
        sofa.lieOn();
    }

    public void createCoffeeTable(){
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();
        coffeeTable.placeItems();
    }
}
