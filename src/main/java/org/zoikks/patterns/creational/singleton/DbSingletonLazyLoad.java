package org.zoikks.patterns.creational.singleton;

/**
 *
 * Example of a lazily loaded singleton.
 *
 * If everything is eagerly loaded, it would slow down the entire system.
 *
 * Issue with this is that it isn't thread safe.
 *
 */
public class DbSingletonLazyLoad {

    private static DbSingletonLazyLoad instance;

    private DbSingletonLazyLoad() {

    }

    public static DbSingletonLazyLoad getInstance() {

        if (instance == null) {
            instance = new DbSingletonLazyLoad();
        }

        return instance;
    }
}