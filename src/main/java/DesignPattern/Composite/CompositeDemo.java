package DesignPattern.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Item iphone = new Iphone();
        Item samsung = new Samsung();
        Item earbuds = new GalaxyEarBuds();

        Box iphoneBox = new Box();
        iphoneBox.addItem(iphone);

        Box samsungBox = new Box();
        samsungBox.addItem(samsung);
        samsungBox.addItem(earbuds);

        Box largerBox = new Box();
        largerBox.addItem(iphoneBox);
        largerBox.addItem(samsungBox);

        System.out.println("Your order contains following items: " + largerBox.description());
        System.out.println("Total cost of all items : " + largerBox.cost());

    }
}
