package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.onlineshoppingapps.entity.Product;

@Repository
public interface ProductJpaDao extends JpaRepository<Product, Integer> {

}