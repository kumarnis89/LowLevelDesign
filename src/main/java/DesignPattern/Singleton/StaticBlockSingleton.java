package DesignPattern.Singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){

    }

    static {
        INSTANCE = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();

        System.out.println("Both objects are same : " + (s1==s2));
    }
}
