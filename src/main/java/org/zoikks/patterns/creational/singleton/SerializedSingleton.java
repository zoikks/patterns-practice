package org.zoikks.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    // TODO Uncomment this method to make serialized instances equal to one another.
    /*protected Object readResolve() {
        return getInstance();
    }*/
}
