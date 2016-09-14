package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.User;

public interface IUserService {
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUse(Integer userId);
	
	public User getUser(Integer userId);
	
	public User getUserByUsername(String username);
	
	public List<User> listUser();
	
}
