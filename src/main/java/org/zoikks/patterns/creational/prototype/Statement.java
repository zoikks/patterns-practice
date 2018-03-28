package org.zoikks.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Statement implements Cloneable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Statement.class);

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {

        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.error("Unable to clone object.", e);
        }

        return null;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
