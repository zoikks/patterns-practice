package org.zoikks.patterns.creational.singleton;

/**
 *
 * Instance is initialized upon class loading into the JVM.
 *
 * This has a benefit over eager initialization in that it can handle exceptions.
 *
 * Nevertheless, it is still initialized once the class is loaded into the JVM.
 *
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance.");
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}