package DesignPattern.State;

public class NotEnoughMoneyState implements VendingMachineState{
    public NotEnoughMoneyState() {
        System.out.println("You don't seem to have enough balance");
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
        System.out.println("You don't have sufficient balance. Please add money");
    }

    @Override
    public void selectItem(VendingMachineContext context, Item item) {
        System.out.println("You don't have sufficient balance. Please add money");
    }
}
