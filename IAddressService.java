package com.cg.onlineshoppingapps.service;

import java.util.List;

import com.cg.onlineshoppingapps.entity.Address;

public interface IAddressService {

	public Address addAddress(Address add);

	public Address updateAddress(Address add);

	public Address removeAddress(Address add);

	public List<Address> viewAllAddress(Address add);

	public Address viewAddress(Address add);
//	public List<Address> viewAddress();

}
