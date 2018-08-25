package com.bus365.root.service;

import java.util.List;

import com.bus365.root.model.Address;

public interface AddressService {
	
	public List<Address> listAddress();
	public Address getAddressByid(Long id) ;
}
