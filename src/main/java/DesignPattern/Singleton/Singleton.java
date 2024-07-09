package DesignPattern.Singleton;

import java.io.Serializable;

/*
    This is an example of lazy-loaded singleton pattern, as creation of object is deferred until we call getInstance()
    but this implementation is not thread safe.

    We are implementing Cloneable and Serializable to show how can we break the singleton pattern
 */
public class Singleton implements Cloneable, Serializable {
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

    @Override
    public Singleton clone() throws CloneNotSupportedException {
        try {
            Singleton clone = (Singleton) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /*
        to ensure singleton during deserialization
        if this method is present in Singleton class, then it makes sure that when deserializing it always returns the existing instance,
        as this method is called after deserialization.
        Remove this to break the singleton pattern by using serialization
     */
    protected Object readResolve() {
        return instance;
    }
}
