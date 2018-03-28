package org.zoikks.patterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Concepts:
 *
 *  - Handles complex constructors
 *  - Large number of parameters
 *  - Immutability
 *  - Examples:
 *      * StringBuilder
 *      * DocumentBuilder
 *      * Locale.Builder
 *
 * The StringBuilder is much more performant than the '+'.
 *
 */
public class BuilderEverdayDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderEverdayDemo.class);

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");

        builder.append("of the builder pattern.  ");

        builder.append("It has methods to append ");

        builder.append("almost anything we want to a String. ");

        builder.append(42);

        LOGGER.debug(builder.toString());
    }
}