package org.zoikks.patterns.creational.abstractfactory;

/**
 *
 * In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an
 * Abstract Factory class that will return the sub-class based on the input factory class.
 *
 * Benefits
 *  Abstract Factory design pattern provides approach to code for interface rather than implementation.
 *  Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for
 *      example we can add another sub-class Laptop and a factory LaptopFactory.
 *  Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 *
 * Examples in the JDK:
 *  javax.xml.parsers.DocumentBuilderFactory#newInstance()
 *  javax.xml.transform.TransformerFactory#newInstance()
 *  javax.xml.xpath.XPathFactory#newInstance()
 *
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}