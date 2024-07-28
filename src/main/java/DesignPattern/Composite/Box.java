package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item{
    List<Item> itemsList;

    public Box() {
        itemsList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemsList.add(item);
    }

    public void remove(Item item){
        itemsList.remove(item);
    }

    @Override
    public double cost() {
        double totalCost = 0.0d;
        for(Item item : itemsList){
            totalCost+= item.cost();
        }
        return totalCost;
    }

    @Override
    public String description() {
        String desc = "";
        for(Item item : itemsList){
            desc+= item.description() + ", ";
        }
        return desc;
    }
}
