package DesignPattern.Singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SynchronizedSingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SynchronizedSingleton s1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton s2 = SynchronizedSingleton.getInstance();

        System.out.println("Both objects are same : " + (s1==s2));
    }
}
