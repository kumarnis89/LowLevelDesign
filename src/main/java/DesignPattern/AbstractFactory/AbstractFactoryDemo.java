package DesignPattern.AbstractFactory;

public class AbstractFactoryDemo {
    private static FurnitureShop shop;

    public static void main(String[] args) {
        // Modern variant
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        shop = new FurnitureShop(modernFurnitureFactory);
        shop.createChair();
        shop.createSofa();
        shop.createCoffeeTable();

        //Victorian variant
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        shop = new FurnitureShop(victorianFurnitureFactory);
        shop.createChair();
        shop.createSofa();
        shop.createCoffeeTable();

        //ArtDeco variant
        FurnitureFactory artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
        shop = new FurnitureShop(artDecoFurnitureFactory);
        shop.createChair();
        shop.createSofa();
        shop.createCoffeeTable();
    }
}
