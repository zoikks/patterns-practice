package org.zoikks.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

    private static final Logger LOG = LoggerFactory.getLogger(AdapterEverydayDemo.class);

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[] {42, 43, 44};

        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        LOG.debug(arrayOfInts.toString());

        LOG.debug(listOfInts.toString());
    }
}