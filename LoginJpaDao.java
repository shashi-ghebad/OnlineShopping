package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineshoppingapps.entity.User;

@Repository
public interface LoginJpaDao extends JpaRepository<User, String> {

}
