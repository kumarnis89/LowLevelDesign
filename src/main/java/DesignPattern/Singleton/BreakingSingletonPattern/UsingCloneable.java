package DesignPattern.Singleton.BreakingSingletonPattern;

import DesignPattern.Singleton.Singleton;

/*
    If the Singleton class implements Cloneable, you can create a new instance by calling the clone method.
 */
public class UsingCloneable {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        try{
            singleton2 = (Singleton) singleton1.clone();
            // here we can copy all mutable fields
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("Singleton1 : " + singleton1);
        System.out.println("Singleton2 : " + singleton2);

        System.out.println("Both objects are same ? " + (singleton1==singleton2));
    }
}
