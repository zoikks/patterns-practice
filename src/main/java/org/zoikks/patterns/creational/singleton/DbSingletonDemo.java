package org.zoikks.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Singleton Pitfalls:
 *
 *  - Often overused.
 *  - Difficult to unit test.
 *  - Not Thread-safe
 *  - Sometimes confused for Factory (if arguments are involved, it is a Factory)
 *  - java.util.Calendar is NOT a singleton
 *      * Prototype
 *
 * Singleton:
 *
 *  - Returns same instance
 *      * One constructor - no args
 *  - No interface
 */
public class DbSingletonDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(DbSingletonDemo.class);

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        DbSingleton anotherInstance = DbSingleton.getInstance();

        LOGGER.debug("Instance 1: " + instance);
        LOGGER.debug("Instance 2: " + anotherInstance);

        DbSingletonLazyLoad lazyLoadInstance = DbSingletonLazyLoad.getInstance();
        DbSingletonLazyLoad anotherLazyLoadInstance = DbSingletonLazyLoad.getInstance();

        LOGGER.debug("Lazy Instance 1: " + lazyLoadInstance);
        LOGGER.debug("Lazy Instance 2: " + anotherLazyLoadInstance);

        DbSingletonThreadSafe threadSafeInstance = DbSingletonThreadSafe.getInstance();
        DbSingletonThreadSafe anotherThreadSafeInstance = DbSingletonThreadSafe.getInstance();

        LOGGER.debug("Threadsafe Instance 1: " + threadSafeInstance);
        LOGGER.debug("Threadsafe Instance 2: " + anotherThreadSafeInstance);
    }
}