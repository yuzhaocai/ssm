package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.User;

public interface UserMapper extends SqlMapper {
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer userId);
	
	public User getUser(Integer userId);
	
	public User getUserByUsername(String username);
	
	public List<User> listUser();
	
	public List<User> listUser(int pageNum,int pageSize);
	
}
