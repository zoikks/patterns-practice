package org.zoikks.patterns.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order {

    private static final Logger LOGGER = LoggerFactory.getLogger(Order.class);

    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        LOGGER.debug("Ordering " + item + " for order number " + orderNumber);
    }
}