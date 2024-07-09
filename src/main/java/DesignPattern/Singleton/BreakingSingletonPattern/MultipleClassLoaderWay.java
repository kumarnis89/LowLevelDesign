package DesignPattern.Singleton.BreakingSingletonPattern;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/*
    In some environments, multiple class loaders can load the same class more than once
    , resulting in different instances. This can happen in case of web servers where there can be multiple
    classloader. This example is not working as expected.
 */
public class MultipleClassLoaderWay {

    public static void main(String[] args) throws Exception {
        URL classUrl = new URL("file:/C:/Users/kumar/OneDrive/Desktop/LLD/Low Level Design/src/main/java/DesignPattern/Singleton.class");
        URL[] classUrls = { classUrl };

        ClassLoader classLoader1 = new URLClassLoader(classUrls);
        ClassLoader classLoader2 = new URLClassLoader(classUrls);

        Class<?> singletonClass1 = classLoader1.loadClass("DesignPattern.Singleton.Singleton");
        Class<?> singletonClass2 = classLoader2.loadClass("DesignPattern.Singleton.Singleton");

        Method getInstanceMethod1 = singletonClass1.getMethod("getInstance");
        Method getInstanceMethod2 = singletonClass2.getMethod("getInstance");

        Object singleton1 = getInstanceMethod1.invoke(null);
        Object singleton2 = getInstanceMethod2.invoke(null);

        System.out.println("Singleton1 : " + singleton1);
        System.out.println("Singleton2 : " + singleton2);

        System.out.println("Both objects are same ? " + (singleton1==singleton2));

    }
}
