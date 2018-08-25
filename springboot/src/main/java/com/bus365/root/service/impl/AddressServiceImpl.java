package com.bus365.root.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bus365.root.model.Address;
import com.bus365.root.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Address> listAddress(){
		List resultList = entityManager.createNativeQuery("select * from address ", Address.class).getResultList();
		return resultList;
	}
	
	@Transactional(rollbackOn= {Exception.class})
	public Address getAddressByid(Long id) {
		Address singleResult = null;
		try {
			singleResult = (Address) entityManager
					.createNativeQuery("select * from address where id = :id", Address.class).setParameter("id", id)
					.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return singleResult;
	}
}
