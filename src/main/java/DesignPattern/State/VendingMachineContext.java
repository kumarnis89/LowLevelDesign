package DesignPattern.State;

import java.util.Map;

public class VendingMachineContext {
    private VendingMachineState state;
    private Map<String,Item> inventory;
    private double current_balance;
    private String selectedItem;

    public VendingMachineContext() {
    }

    public VendingMachineContext(VendingMachineState state){
        this.state = state;
    }

    public Map<String, Item> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Item> inventory) {
        this.inventory = inventory;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public boolean hasEnoughMoney(String item){
        return current_balance>= inventory.get(item).getPrice();
    }

    public void setCurrent_balance(double current_balance) {
        this.current_balance = current_balance;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public double getCurrent_balance() {
        return current_balance;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    // delegate these methods to respective state
    public void addMoney(double amount){
        this.state.addMoney(this,amount);
    }

    public void selectItem(Item item){
        this.state.selectItem(this,item);
    }

    public void dispenseItem(){
        this.state.dispenseItem(this);
    }
}
