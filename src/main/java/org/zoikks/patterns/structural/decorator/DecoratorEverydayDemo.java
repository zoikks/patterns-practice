package org.zoikks.patterns.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

    /**
     *
     * Good example of why the streams are built the way they are...
     *
     * So we can daisy-chain the instances to one another without having to have a specific class to run it.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        File file = new File("./output.txt");
        file.createNewFile();

        // OutputStream is a base decorator and the FileOutputStream is a concrete decorator.
        OutputStream oStream = new FileOutputStream(file);

        // Turn around and pass the OutputStream to a DataOutputStream so we can write data to the stream.
        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }
}
