package com.cg.onlineshoppingapps.dao;

import com.cg.onlineshoppingapps.pojo.User;

public interface ILoginRepository {

	public User addUser(User user);

	public User removeUser(User user);

	public User validateUser(User user);

	public User signOut(User user);
}
