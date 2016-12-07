package com.niit.Ecart.Service;

import java.util.List;

import com.niit.Ecart.model.Customer;

public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);
}
