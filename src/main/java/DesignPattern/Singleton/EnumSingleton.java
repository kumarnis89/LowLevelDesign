package DesignPattern.Singleton;

/*

    An enum singleton is a design pattern where a singleton is implemented using a Java enum.
    Enum types in Java are implicitly final and have a private constructor by default,
    which makes them a natural fit for implementing singletons.
    Here’s how an enum singleton works and its characteristics:

    Characteristics of Enum Singleton
    Singleton Guarantee: Enums guarantee that only one instance of each enum value exists.

    Thread Safety: Enum values are inherently thread-safe and are initialized lazily.

    Serialization Safety: Enum instances are inherently serializable and deserialization doesn’t create new instances.
 */
public enum EnumSingleton {
    SINGLETON;

    public void doSomething(){
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        EnumSingleton e1 = SINGLETON;
        EnumSingleton e2 = SINGLETON;

        System.out.println("Both object are same : " + (e1==e2));
    }
}
