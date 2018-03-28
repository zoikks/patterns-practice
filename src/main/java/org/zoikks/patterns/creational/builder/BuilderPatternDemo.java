package org.zoikks.patterns.creational.builder;

/**
 *
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when
 * the Object contains a lot of attributes.
 *
 * There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of
 * attributes.
 *
 * 1 - Too Many arguments to pass from client program to the Factory class that can be error prone because most of the
 * time, the type of arguments are same and from client side its hard to maintain the order of the argument.
 * 2 - Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and
 * optional parameters need to send as NULL.
 * 3 - If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that
 * is confusing.
 *
 * Examples from JDK:
 *
 * java.lang.StringBuilder#append() (unsynchronized)
 * java.lang.StringBuffer#append() (synchronized)
 *
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}