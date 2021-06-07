package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineshoppingapps.entity.Customer;

@Repository
public interface CustomerJpaDao extends JpaRepository<Customer, Integer> {

}
