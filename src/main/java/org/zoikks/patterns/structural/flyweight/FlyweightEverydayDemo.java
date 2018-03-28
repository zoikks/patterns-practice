package org.zoikks.patterns.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyweightEverydayDemo {

    private static final Logger LOG = LoggerFactory.getLogger(FlyweightEverydayDemo.class);

    public static void main(String[] args) throws Exception {

        Integer firstInt = Integer.valueOf(5);

        Integer secondInt = Integer.valueOf(5);

        Integer thirdInt = Integer.valueOf(10);

        LOG.debug("HashCode1: " + System.identityHashCode(firstInt));
        LOG.debug("HashCode2: " + System.identityHashCode(secondInt));
        LOG.debug("HashCode3: " + System.identityHashCode(thirdInt));
    }
}
