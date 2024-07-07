package DesignPattern.State;

public class DispensingState implements VendingMachineState{
    @Override
    public void addMoney(VendingMachineContext context, double amount) {
        System.out.println("Please wait while item is being dispensed");
    }

    @Override
    public void dispenseItem(VendingMachineContext context) {
        String selectedItem = context.getSelectedItem();
        if(selectedItem==null){
            System.out.println("select an item first !!");
            return;
        }

        Item item = context.getInventory().get(selectedItem);
        if(item.getQuantity()==0){
            context.setState(new SelectedItemOutOfStockState());
            return;
        }

        double expense = context.getInventory().get(selectedItem).getPrice();
        double remaining_balance = context.getCurrent_balance() - expense;
        if(remaining_balance<0) {
            context.setState(new NotEnoughMoneyState());
            return;
        }
        context.setCurrent_balance(remaining_balance);
        item.setQuantity(item.getQuantity()-1);
        System.out.println("please collect your item : " + selectedItem);
        context.setState(new ReadyState());
    }

    @Override
    public void selectItem(VendingMachineContext context, Item item) {
        System.out.println("Please wait while item is being dispensed");
    }
}
