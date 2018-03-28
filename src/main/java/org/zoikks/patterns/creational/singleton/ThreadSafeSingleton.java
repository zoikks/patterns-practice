package org.zoikks.patterns.creational.singleton;

/**
 *
 * This implementation provides thread safety but it reduces the performance
 * because of the cost associated with the synchronized method.
 *
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    /**
     *
     * Not the greatest implementation because the "synchronized" is at the method
     * level.  This can cause a lot of overhead:
     *
     * https://www.journaldev.com/1061/thread-safety-in-java
     *
     */
    public static synchronized ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    /**
     *
     * This avoids the overhead of a synchronized method.  Using the "double checked locking"
     * principle, the synchronized block is used inside the if-condition with an
     * additional check to ensure that only one instance of the singleton class is
     * created.
     *
     * @return
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {

        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
