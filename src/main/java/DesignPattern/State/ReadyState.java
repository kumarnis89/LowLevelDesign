package DesignPattern.State;

public class ReadyState implements VendingMachineState{

    public ReadyState() {
        System.out.println("Vending machine is ready!!");
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
        System.out.println("Please select an item");
    }

    @Override
    public void selectItem(VendingMachineContext context, Item item) {
        context.setSelectedItem(item.getName());
        context.setState(new DispensingState());
        context.dispenseItem();
    }
}
