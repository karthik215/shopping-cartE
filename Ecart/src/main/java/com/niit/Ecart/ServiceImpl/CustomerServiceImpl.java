package com.niit.Ecart.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Ecart.DAO.CustomerDAO;
import com.niit.Ecart.Service.CustomerService;
import com.niit.Ecart.model.Customer;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDao;

    public void addCustomer (Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById(int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerByUsername (String username) {
        return customerDao.getCustomerByUsername(username);
    }
}
