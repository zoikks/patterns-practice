package org.zoikks.patterns.creational.singleton;

/**
 *
 * Instance is initialized immediately upon class loading into the JVM.
 *
 * Singleton classes are created for resources such as File System, Database connections, etc
 * and we should avoid the instantiation unless client calls the getInstance method.  Also, this
 * method of singleton management doesn't provide any options for exception handling.
 *
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world.");
    }
}
