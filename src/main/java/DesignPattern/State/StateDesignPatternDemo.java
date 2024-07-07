package DesignPattern.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateDesignPatternDemo {

    public static void main(String[] args) {
        VendingMachineContext context = new VendingMachineContext(new ReadyState());

        // Add items to inventory
        Map<String,Item> inventoryList = new HashMap<>();
        inventoryList.put("Chocolate",new Item(10.0d,1,"Chocolate"));
        inventoryList.put("Biscuit",new Item(20.0d,10,"Biscuit"));
        inventoryList.put("Lassi",new Item(15.0d,10,"Lassi"));
        inventoryList.put("Butter Milk",new Item(10.0d,10,"Butter Milk"));
        inventoryList.put("Milk Shake",new Item(25.0d,10,"Milk Shake"));
        context.setInventory(inventoryList);

        //set of actions
        context.setCurrent_balance(100.0);
        context.selectItem(inventoryList.get("Chocolate"));
        System.out.println("Remaining balance : "+context.getCurrent_balance());

        //out of stock scenerio
        context.selectItem(inventoryList.get("Chocolate"));
        System.out.println("Remaining balance : "+context.getCurrent_balance());

        //



    }
}
