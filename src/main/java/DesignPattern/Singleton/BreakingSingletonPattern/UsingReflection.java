package DesignPattern.Singleton.BreakingSingletonPattern;

import DesignPattern.Singleton.Singleton;

import java.lang.reflect.Constructor;

/*
    Using reflection, you can access the private constructor of the Singleton class and create a new instance.
 */
public class UsingReflection {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        try{
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton2 = constructor.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Singleton1 : " + singleton1);
        System.out.println("Singleton2 : " + singleton2);

        System.out.println("Both objects are same ? " + (singleton1==singleton2));
    }
}
