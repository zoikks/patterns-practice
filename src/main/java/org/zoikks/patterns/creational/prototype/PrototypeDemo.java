package org.zoikks.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Pitfalls:
 *  - Sometimes not clear when to use.
 *  - Used with other patterns
 *      * Registry
 *  - Shallow VS Deep Copy
 *
 *  Contrast:
 *
 *  Prototype:
 *      - Light weight construction
 *          * Copy constructor or clone
 *      - Shallow or Deep
 *      - Copy of itself
 *
 *  Factory:
 *      - Flexible Objects
 *          * Multiple constructors
 *      - Concrete Instance
 *      - Fresh instance (because of "new")
 */
public class PrototypeDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeDemo.class);

    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        LOGGER.debug("Movie Instance: " + movie);
        LOGGER.debug("Runtime: " + movie.getRuntime());
        LOGGER.debug("Title: " + movie.getTitle());
        LOGGER.debug("URL: " + movie.getUrl());

        Movie anotherMovie = (Movie)registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        LOGGER.debug("Another Movie Instance: " + anotherMovie);
        LOGGER.debug("Another Movie Runtime: " + anotherMovie.getRuntime());
        LOGGER.debug("Another Movie Title: " + anotherMovie.getTitle());
        LOGGER.debug("Another Movie URL: " + anotherMovie.getUrl());
    }
}
