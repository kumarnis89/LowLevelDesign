package DesignPattern.Singleton;

public class EagerLoadingSingleton {
    /*
        When class is loaded then only INSTANCE is initialized. i.e; object is eagerly-loaded.
     */
    private static final EagerLoadingSingleton INSTANCE = new EagerLoadingSingleton();

    private EagerLoadingSingleton(){
        if(INSTANCE!=null){
            throw new UnsupportedOperationException("Instance already exists. please use getInstance() method instead");
        }
    }

    public static EagerLoadingSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerLoadingSingleton e1 = EagerLoadingSingleton.getInstance();
        EagerLoadingSingleton e2 = EagerLoadingSingleton.getInstance();

        System.out.println("Both instances are same : "+ (e1==e2));
    }
}
