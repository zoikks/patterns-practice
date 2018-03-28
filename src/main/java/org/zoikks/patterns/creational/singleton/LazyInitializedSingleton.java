package org.zoikks.patterns.creational.singleton;

/**
 *
 * Example of a singleton object.
 *
 * Works fine when it comes to single-threaded environment.  It can
 * cause issues if multiple threads are inside the if loop at the same
 * time.  It will destroy the singleton pattern and both threads will
 * get the different instance of the singleton class.
 *
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {

    }

    public static LazyInitializedSingleton getInstance() {

        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world.");
    }
}