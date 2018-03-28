package org.zoikks.patterns.creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryEverydayDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryEverydayDemo.class);

    public static void main(String[] args) throws Exception {

        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        LOGGER.debug("Root element: " + doc.getDocumentElement().getNodeName());
        LOGGER.debug(abstractFactory.getClass().toString());
        LOGGER.debug(factory.getClass().toString());
    }
}