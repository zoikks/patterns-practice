package org.zoikks.patterns.creational.prototype;

/**
 *
 * Factory Pattern is used when there is a super class with multiple sub-classes and based on input,
 * needs to return one of the sub-classes.  This pattern removes the responsibility of instantiation of
 * a class from client program to the factory class.
 *
 * This pattern is also known as "Factory Method Design Pattern"
 *
 * Advantages:
 *
 * Factory design pattern provides approach to code for interface rather than implementation.
 * Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes
 *  our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation
 *  because client program is unaware of this.
 * Factory pattern provides abstraction between implementation and client classes through inheritance.
 *
 * Examples in the JDK:
 *
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}