package org.zoikks.patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * This implementation may feel like a creational pattern, but it is structural because
 * we're adding functionality to the SimpleSandwich.
 *
 * - Original object can stay the same.
 * - Unique way to add functionality
 * - Confused with inheritance
 * - Can be more complex for clients
 *
 * Pitfalls:
 *
 * - New class for every feature added.
 * - Multiple little objects
 * - Often confused with simple inheritance
 *
 * Contrast:
 *
 * Composite:
 *  - Tree structure
 *  - Leaf and Composite have same interface
 *  - Unity between objects
 *
 * Decorator:
 *  - Contains another entity
 *  - Modifies behavior (adds)
 *  - Doesn't change underlying object
 *
 */
public class DecoratorSandwichDemo {

    private static final Logger LOG = LoggerFactory.getLogger(DecoratorSandwichDemo.class);

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        LOG.debug(sandwich.make());
    }
}
