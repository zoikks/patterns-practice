package org.zoikks.patterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterDemo.class);

    public static void main(String[] args) {

        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());

        LOGGER.debug(service.getTimeline("bh5k"));
    }
}