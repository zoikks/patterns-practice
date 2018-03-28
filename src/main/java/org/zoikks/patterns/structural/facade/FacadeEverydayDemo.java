package org.zoikks.patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


/**
 *
 * Simplifies client interface
 * Easy pattern to implement
 * Refactoring pattern
 *
 * A great example of this is a JDBC connection.  If we create a facade around the connection/query information, the
 * client would never need to know anything about how it things are being done.
 *
 * Pitfalls:
 *
 * - Typically used to clean up code.
 * - Should think about API design
 * - Flat problem/structure
 * - The "singleton" of Structural pattern
 *
 * Contrast:
 *
 * Facade:
 * - Simplifies interface
 * - Works with composites
 * - Cleaner API
 *
 * Adapter:
 * - Also a refactoring pattern
 * - Modified behavior (adds)
 * - Provides a different interface
 *
 */
public class FacadeEverydayDemo {

    private static final Logger LOG = LoggerFactory.getLogger(FacadeEverydayDemo.class);

    public static void main(String[] args) throws Exception {

        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            LOG.debug(inputLine);
        }
    }
}