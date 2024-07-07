package DesignPattern.Singleton;

public class DoubleCheckLazyLoadingSingleton {
    private static volatile DoubleCheckLazyLoadingSingleton INSTANCE;

    private DoubleCheckLazyLoadingSingleton(){

    }

    public static DoubleCheckLazyLoadingSingleton getInstance(){
        if(INSTANCE ==  null){
            synchronized (DoubleCheckLazyLoadingSingleton.class){
                if(INSTANCE==null){
                    INSTANCE = new DoubleCheckLazyLoadingSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        DoubleCheckLazyLoadingSingleton d1 = DoubleCheckLazyLoadingSingleton.getInstance();
        DoubleCheckLazyLoadingSingleton d2 = DoubleCheckLazyLoadingSingleton.getInstance();

        System.out.println("Both objects are same : "+ (d1==d2));
    }
}
