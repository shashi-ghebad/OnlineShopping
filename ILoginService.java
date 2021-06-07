package com.cg.onlineshoppingapps.service;

import com.cg.onlineshoppingapps.entity.User;

public interface ILoginService {

	public User addUser(User user);

	public User removeUser(User user);

	public User validateUser(User user);

	public User signOut(User user);
}
