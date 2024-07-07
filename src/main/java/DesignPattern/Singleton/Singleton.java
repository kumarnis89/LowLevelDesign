package DesignPattern.Singleton;

/*
    This is an example of lazy-loaded singleton pattern, as creation of object is deferred until we call getInstance()
    but this implementation is not thread safe.
 */
public class Singleton {
    private static Singleton instance = null;

    /*
       Make constructor private to stop outside object creation. Once we make constructor private, no one can create
       new object directly
     */
    private Singleton(){

    }

    /*
        Keep a static method so that user can access this even if there is no object created
        check if instance is null or not. if not , directly return the already created object
        An instance of Singleton class is not created until getInstance() is called, hence showing
        lazy-loading tendency.
     */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Both instances are same : "+ (s1==s2));
    }

}
