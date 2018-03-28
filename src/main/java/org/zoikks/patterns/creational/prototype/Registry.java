package org.zoikks.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static final Logger LOGGER = LoggerFactory.getLogger(Registry.class);

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    // This method is the heart and soul of the Prototype pattern.
    public Item createItem(String type) {

        Item item = null;

        try {
            // NOTE:  Always have to cast the cloned type.  UGLY!
            // Recommended implementing your own interface using generics to eliminate the explicit cast.
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.error("Unable to clone instance.", e);
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");

        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");

        items.put("Book", book);
    }
}
