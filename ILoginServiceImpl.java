package com.cg.onlineshoppingapps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineshoppingapps.dao.LoginJpaDao;
import com.cg.onlineshoppingapps.entity.User;

@Service
public class ILoginServiceImpl implements ILoginService {
	
	@Autowired
	LoginJpaDao loginJpaDao;

	public ILoginServiceImpl() {
	 
	}

	@Override
	public User addUser(User user) {
		return loginJpaDao.save(user);
	}

	@Override
	public User removeUser(User user) {
		return null;
	}

	@Override
	public User validateUser(User user) {
		return null;
	}

	@Override
	public User signOut(User user) {
		return null;
	}

}
