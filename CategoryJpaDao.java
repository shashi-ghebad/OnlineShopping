package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineshoppingapps.entity.Category;

public interface CategoryJpaDao extends JpaRepository<Category, Integer> {

}
