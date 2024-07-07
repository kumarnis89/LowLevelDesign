package DesignPattern.State;

public class SelectedItemOutOfStockState implements VendingMachineState{

    public SelectedItemOutOfStockState() {
        System.out.println("Selected item is out of stock");
    }

    @Override
    public void addMoney(VendingMachineContext context, double amount) {
        double new_balance = context.getCurrent_balance() + amount;
        System.out.println("New balance : " + new_balance);
        context.setCurrent_balance(new_balance);
        context.setState(new HasEnoughMoneyState());
    }

    @Override
    public void dispenseItem(VendingMachineContext context) {
        System.out.println("Selected item is out of stock");
    }

    @Override
    public void selectItem(VendingMachineContext context, Item item) {
        context.setSelectedItem(item.getName());
        context.setState(new ReadyState());
    }
}
