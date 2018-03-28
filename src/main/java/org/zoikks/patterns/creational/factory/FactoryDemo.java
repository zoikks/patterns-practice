package org.zoikks.patterns.creational.factory;


/**
 *
 * Pitfalls:
 *  - Complexity
 *  - Creation in subclass
 *  - Refactoring
 *
 * Contrast:
 *
 * Singleton:
 *  - Returns same instance
 *      * One constructor method - no args
 *  - No interface
 *
 * Factory:
 *  - Returns various instances
 *      * Multiple constructors
 *  - Interface driven (contractual)
 *  - Subclasses are involved
 *  - Adaptable to environment more easily.
 *
 */
public class FactoryDemo {

    public static void main(String[] args) {

        Website site = WebsiteFactory.getWebsite("blog");

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("shop");

        System.out.println(site.getPages());
    }
}