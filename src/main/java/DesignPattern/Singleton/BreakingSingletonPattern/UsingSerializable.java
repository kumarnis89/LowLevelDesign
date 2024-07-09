package DesignPattern.Singleton.BreakingSingletonPattern;

import DesignPattern.Singleton.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsingSerializable {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        try{
            // serializing singleton class's object
            FileOutputStream fos = new FileOutputStream("singleton.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(singleton1);
            os.close();
            fos.close();

            // de-serializing the object
            FileInputStream fis = new FileInputStream("singleton.ser");
            ObjectInputStream is = new ObjectInputStream(fis);
            singleton2 = (Singleton) is.readObject();

            /*
                If a class defines a readResolve method, it is called after deserialization to allow the class
                 to control the returned object. This can be used to enforce singletons or return a proxy.
                 As per need add or remove readResolve() method from Singleton class.
             */
            fis.close();
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Singleton1 : " + singleton1);
        System.out.println("Singleton2 : " + singleton2);

        System.out.println("Both objects are same ? " + (singleton1==singleton2));
    }
}
