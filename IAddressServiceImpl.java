package com.cg.onlineshoppingapps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineshoppingapps.dao.AddressJpaDao;
import com.cg.onlineshoppingapps.entity.Address;
@Service
public class IAddressServiceImpl implements IAddressService {

	
	@Autowired
	AddressJpaDao addressJpaDao;
	
	
	public IAddressServiceImpl() {
	}

	@Override
	public Address addAddress(Address add) {
	return addressJpaDao.save(add);
	}

	@Override
	public Address updateAddress(Address add) {
		
		return null;
	}

	@Override
	public Address removeAddress(Address add) {
		return null;
	}

	@Override
	public List<Address> viewAllAddress(Address add) {
		return addressJpaDao.findAll();
	}

	@Override
	public Address viewAddress(Address add) {
		return null;
	}

}
