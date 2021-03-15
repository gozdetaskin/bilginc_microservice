package com.customer.ms.rest.db;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.customer.ms.rest.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameIn(List<String> name);

    List<Customer> findByNameOrderByName(String name);

    List<Customer> findByNameAndSurname(String name, String surname);
    
    List<Customer> findByCif(long cif);

    @Query("select p from Person p where p.name=:isim")
    List<Customer> searchName(@Param("isim") String name);

    @Query(value = "select * from kisi k where k.name=:isim", nativeQuery = true)
    List<Customer> searchNameNative(@Param("isim") String name);
}