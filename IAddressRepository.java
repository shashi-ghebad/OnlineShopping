package com.cg.onlineshoppingapps.dao;

import java.util.List;

import com.cg.onlineshoppingapps.pojo.Address;

public interface IAddressRepository {
	
	public Address addAddress(Address add);

	public Address updateAddress(Address add);

	public Address removeAddress(Address add);

	public List<Address> viewAllAddress(String id);

	public Address viewAddress(Address add);

}
