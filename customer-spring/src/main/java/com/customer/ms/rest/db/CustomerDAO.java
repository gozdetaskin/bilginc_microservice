package com.customer.ms.rest.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.customer.ms.rest.model.Customer;

@Repository
public class CustomerDAO {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Transactional
    public void add(final Customer customerParam)
    {
        EntityManager cemLoc = this.entityManagerFactory.createEntityManager();
        cemLoc.joinTransaction();
        cemLoc.persist(customerParam);
    }
}