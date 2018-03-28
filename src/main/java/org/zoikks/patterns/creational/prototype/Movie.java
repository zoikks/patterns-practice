package org.zoikks.patterns.creational.prototype;

public class Movie extends Item {

    private String runtime;

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRuntime() {
        return this.runtime;
    }
}
