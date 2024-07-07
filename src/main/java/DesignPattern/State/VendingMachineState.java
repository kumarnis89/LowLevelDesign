package DesignPattern.State;

public interface VendingMachineState {
    void addMoney(VendingMachineContext context, double amount);
    void dispenseItem(VendingMachineContext context);
    void selectItem(VendingMachineContext context, Item item);
}
