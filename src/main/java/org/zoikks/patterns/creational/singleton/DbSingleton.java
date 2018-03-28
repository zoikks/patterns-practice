package org.zoikks.patterns.creational.singleton;

/**
 *
 * Example of an eagerly loaded singleton.
 *
 */
public class DbSingleton {

    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        return instance;
    }
}