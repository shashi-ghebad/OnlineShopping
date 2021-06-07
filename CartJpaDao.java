package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineshoppingapps.entity.Cart;

public interface CartJpaDao extends JpaRepository<Cart, Integer>{
}
