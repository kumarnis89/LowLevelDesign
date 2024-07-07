package DesignPattern.Singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    /*
        In this implementation we have a static inner class which has the instance of BillPughSingleton class
        This adds to lazy-loading and since the instance is static field of inner class, it supports multi-threaded
        environment
     */

    private static class BillPughHolder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return BillPughHolder.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton b1 = BillPughSingleton.getInstance();
        BillPughSingleton b2 = BillPughSingleton.getInstance();

        System.out.println("Both objects are same : "+ (b1==b2));

    }
}
