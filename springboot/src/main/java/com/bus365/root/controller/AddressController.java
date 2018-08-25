package com.bus365.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.Address;
import com.bus365.root.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value = "/address/list" ,method =RequestMethod.GET)
	public String listAddress() {
		List<Address> listAddress = addressService.listAddress();
		return listAddress.toString();
	}
	@ResponseBody
	@RequestMapping(value = "/address/get/{id}" ,method =RequestMethod.GET)
	public Address getAddressByid(@PathVariable(value = "id") Long id) {
		Address addressByid = addressService.getAddressByid(id);
		return addressByid;
	}
}
