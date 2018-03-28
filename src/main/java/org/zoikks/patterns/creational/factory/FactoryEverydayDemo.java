package org.zoikks.patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class FactoryEverydayDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(FactoryEverydayDemo.class);

    public static void main(String[] args) {

        // The Calendar object is a great example of a factory pattern.
        // It has different options to create instances based on needs.
        Calendar cal = Calendar.getInstance();

        LOGGER.debug("Calendar: " + cal);

        LOGGER.debug("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}