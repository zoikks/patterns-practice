package org.zoikks.patterns.creational.singleton;

/**
 *
 * Example of a singleton as an enum.
 *
 * The problem with this solution is that it does not allow for flexibility (ie lazy initialization)
 *
 */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        //do something
    }
}