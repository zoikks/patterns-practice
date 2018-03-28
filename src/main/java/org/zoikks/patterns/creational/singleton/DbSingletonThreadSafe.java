package org.zoikks.patterns.creational.singleton;

/**
 *
 * Example of a thread-safe singleton.
 *
 */
public class DbSingletonThreadSafe {

    private static DbSingletonThreadSafe instance;

    private DbSingletonThreadSafe() {

    }

    public static DbSingletonThreadSafe getInstance() {

        if (instance == null) {
            synchronized(DbSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        }

        return instance;
    }
}