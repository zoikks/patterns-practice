package org.zoikks.patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists
 * in the java virtual machine.
 *
 * Although it seems to be a very simple design pattern but when it comes to implementation, it comes with a lot
 * of implementation concerns.  There are a variety of ways to implement the singleton pattern.  Each comes with
 * its owns pros and cons.
 *
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // Lazy implementation
        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();

        System.out.println("lazyInitializedSingleton1 is equal to lazyInitializedSingleton2: " + (lazyInitializedSingleton1 == lazyInitializedSingleton2));

        // Eager implementation
        EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();

        System.out.println("eagerInitializedSingleton1 is equal to eagerInitializedSingleton2: " + (eagerInitializedSingleton1 == eagerInitializedSingleton2));

        // Static Block implementation
        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

        System.out.println("staticBlockSingleton1 is equal to staticBlockSingleton2: " + (staticBlockSingleton1 == staticBlockSingleton2));

        // Thread safe singleton implementation
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println("threadSafeSingleton1 is equal to threadSafeSingleton2: " + (threadSafeSingleton1 == threadSafeSingleton2));

        // Thread safe singleton with less overhead implementation
        ThreadSafeSingleton threadSafeSingleton3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton threadSafeSingleton4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

        System.out.println("threadSafeSingleton3 is equal to threadSafeSingelton4: " + (threadSafeSingleton3 == threadSafeSingleton4));

        // Bill Pugh singleton implementation
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();

        System.out.println("billPughSingleton1 is equal to billPughSingleton2: " + (billPughSingleton1 == billPughSingleton2));


        // Demonstration how Reflection destroys the singleton pattern:
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();

                break;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("instanceOne is not equal to instanceTwo due to Reflection: " + (instanceOne != instanceTwo));

        demoSingletonSerialization();
    }

    private static void demoSingletonSerialization() {

        try {
            SerializedSingleton instanceOne = SerializedSingleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            //deserailize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
            in.close();

            System.out.println("instanceOne is not equal to instanceTwo due to serialization: " + (instanceOne != instanceTwo));

            // But the above instances can be equal by adding the following to SerializedSingleton.java:
            /*
            protected Object readResolve() {
                return getInstance();
            }

             */
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
