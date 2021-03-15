package com.customer.ms.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.ms.rest.db.ICustomerDAO;
import com.customer.ms.rest.model.Customer;

@Service
public class CustomerController
{
    @Autowired
    private ICustomerDAO customerDAO;

    public void addOrUpdate(final Customer customerDAO)
    {
        this.customerDAO.save(customerDAO);
    }

    public List<Customer> get(final Long cif)
    {
        return this.customerDAO.findByCif(cif);
    }

    public List<Customer> getByName(final String nameStringParam)
    {
        return this.customerDAO.findByName(nameStringParam);
    }

    public void delete(final Long cif)
    {
        this.customerDAO.deleteById(cif);
    }

    public List<Customer> getAll()
    {
        Iterable<Customer> findAllLoc = this.customerDAO.findAll();
        List<Customer> personsLoc = new ArrayList<>();
        for (Customer personLoc : findAllLoc)
        {
            personsLoc.add(personLoc);
        }
        return personsLoc;
    }
}