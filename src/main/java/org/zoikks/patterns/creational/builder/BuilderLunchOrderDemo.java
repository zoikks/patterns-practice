package org.zoikks.patterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *

 *
 * Contrasted to the Prototype pattern.
 *
 * Builder:
 *  - Handles complex constructors
 *  - No interface required
 *  - Can be a separate class
 *  - Works with legacy code.
 *
 * Prototype:
 *  - Implemented around a clone
 *  - Avoids calling complex constructors
 *  - Difficult to implement in legacy code
 *
 * Both patterns are intended to deal with complex constructors.
 *
 */
public class BuilderLunchOrderDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderLunchOrderDemo.class);

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        LOGGER.debug(lunchOrder.getBread());
        LOGGER.debug(lunchOrder.getCondiments());
        LOGGER.debug(lunchOrder.getDressing());
        LOGGER.debug(lunchOrder.getMeat());
    }
}
