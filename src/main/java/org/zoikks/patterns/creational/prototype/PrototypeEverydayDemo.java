package org.zoikks.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This demonstrates an example of a shallow copy.
 *
 * Can be a little dangerous since modifications to the parameters in firstInstance are reflected in secondInstance.
 *
 */
public class PrototypeEverydayDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeEverydayDemo.class);

    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);

        LOGGER.debug("First Instance: " + firstStatement);

        LOGGER.debug("First SQL: " + firstStatement.getSql());

        LOGGER.debug("First Parameters: " + firstStatement.getParameters());

        LOGGER.debug("First Record: " + firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        LOGGER.debug("Second Instance: " + secondStatement);

        LOGGER.debug("Second SQL: " + secondStatement.getSql());

        LOGGER.debug("Second Parameters: " + secondStatement.getParameters());

        LOGGER.debug("Second Record: " + secondStatement.getRecord());

        secondStatement.setRecord(new Record());

        // This shallow copy is dangerous because the following change is reflected in both instances...

        firstStatement.getParameters().add("New parameter...");

        LOGGER.debug("First Parameters (again): " + firstStatement.getParameters());

        LOGGER.debug("Second Parameters (again): " + secondStatement.getParameters());
    }
}