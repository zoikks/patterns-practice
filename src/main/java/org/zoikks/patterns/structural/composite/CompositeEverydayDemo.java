package org.zoikks.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Map and other Collection(s) are interesting implementations of the composite pattern.
 * Most of them have the option of adding all attributes of one collection/map into another.  With
 * the key distinction that one element of the map is treated just like the map itself.
 *
 */
public class CompositeEverydayDemo {

    private static final Logger LOG = LoggerFactory.getLogger(CompositeEverydayDemo.class);

    public static void main(String[] args) {

        Map<String, String> personAttributes = new HashMap<>();

        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();

        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();

        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        LOG.debug(secAttributes.toString());
    }
}
