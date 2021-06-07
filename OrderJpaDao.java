package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineshoppingapps.entity.Order;

public interface OrderJpaDao extends JpaRepository<Order, Integer> {

}
