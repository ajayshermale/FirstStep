package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.UserDAOImpl;
import com.firststep.model.UserDetail;

@Service
public class UserService {

	@Autowired
	private UserDAOImpl userDAOImpl;
	
	@Transactional
	public void saveOrupdate(UserDetail userdetail)
	{
		userDAOImpl.saveOrupdate(userdetail);
	}
	
	@Transactional
	public void createSupplier(UserDetail userdetail)
	{
		userDAOImpl.createSupplier(userdetail);
	}
}
