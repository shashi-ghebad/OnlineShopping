package com.cg.onlineshoppingapps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.onlineshoppingapps.entity.Address;

@Repository
public interface AddressJpaDao extends JpaRepository<Address,Integer>{
	

}
