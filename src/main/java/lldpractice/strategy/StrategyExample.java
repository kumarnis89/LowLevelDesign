package lldpractice.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        Engineer sde1Engineer = new SDE1Engineer("Sumit", Designation.SDE1,new Sde1Strategy());
        System.out.println(sde1Engineer.calculateIncrement());
        Engineer sde2Engineer = new SDE2Engineer("Nishant", Designation.SDE2,new Sde2Strategy());
        System.out.println(sde2Engineer.calculateIncrement());
        Engineer sde3Engineer = new SDE3Engineer("Ruchi", Designation.SDE3,new Sde3Strategy());
        System.out.println(sde3Engineer.calculateIncrement());
    }
}
