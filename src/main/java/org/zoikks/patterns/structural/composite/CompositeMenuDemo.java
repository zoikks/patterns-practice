package org.zoikks.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Generalizes a hierarchical structure
 * Can simplify things too much
 * Easier for clients
 * Composite != Composition
 *
 * Pitfalls:
 *  - Can overly simplify system
 *  - Difficult to restrict
 *  - Implementation can possibly be costly.
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
public class CompositeMenuDemo {

    private static final Logger LOG = LoggerFactory.getLogger(CompositeMenuDemo.class);

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        LOG.debug(mainMenu.toString());
    }
}