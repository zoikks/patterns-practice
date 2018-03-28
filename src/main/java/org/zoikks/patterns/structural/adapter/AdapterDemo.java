package org.zoikks.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 * Summary:
 *  - Simple solution
 *  - Easy to implement
 *  - Integrate with Legacy
 *  - Can provide multiple adapters
 *
 * Pitfalls:
 *  - Not a lot!
 *  - Don't complicate
 *  - Multiple Adapters
 *  - Don't add functionality
 *
 * Contrast:
 *
 * Adapter:
 *  - Works after code is designed
 *  - Legacy
 *  - Retrofitted
 *  - Provides different interface
 *
 * Bridge:
 *  - Designed upfront
 *  - Abstraction and implementation vary
 *  - Build in advance
 *  - Both adapter multiple systems
 *
 */
public class AdapterDemo {

    private static final Logger LOG = LoggerFactory.getLogger(AdapterDemo.class);

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        // Will not work!  This is where the adapter comes into play!
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        LOG.debug(employees.toString());
    }
}