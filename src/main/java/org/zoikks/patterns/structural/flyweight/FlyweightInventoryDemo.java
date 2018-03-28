package org.zoikks.patterns.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * - Great for Memory Management
 * - A little bit complex
 * - Used a lot by the core API (Integer, String, etc)
 *
 * Pitfalls:
 *
 * - Complex pattern
 * - Premature optimization
 * - Must understand Factory pattern
 * - Not a graphical pattern
 *
 * Contrast:
 *
 * Flyweight:
 * - Memory optimization
 * - Optimization pattern
 * - Immutable Objects
 *
 * Facade:
 * - Refactoring Pattern
 * - Simplified Client
 * - Provides a different interface
 *
 */
public class FlyweightInventoryDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlyweightInventoryDemo.class);

    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 563);
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung TV", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung TV", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        LOGGER.debug(ims.report());
    }
}