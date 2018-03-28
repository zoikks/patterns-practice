package org.zoikks.patterns.creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Review:
 *  - Group of similar Factories
 *  - Complex
 *  - Heavy abstraction
 *  - Framework pattern (not usually specific to a single problem)
 *
 * Pitfalls:
 *  - Complexity (most complex of all creational design patterns)
 *  - Runtime switch
 *  - Pattern within a pattern
 *  - Problem specific
 *  - Starts as a Factory
 *
 * Contrast:
 *
 * Factory:
 *  - Returns various instances
 *      * Multiple constructors
 *  - Interface driven
 *  - Adaptable to environment more easily
 *
 * AbstractFactory:
 *  - Includes everything from the Factory pattern (PLUS)
 *  - Implemented with a Factory
 *  - Hides the Factory
 *  - Abstracts Environment
 *  - Build through Composition
 *
 *
 */
public class AbstractFactoryDemo {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractFactoryDemo.class);

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        LOG.debug(card.getClass().toString());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        LOG.debug(card2.getClass().toString());
    }
}
