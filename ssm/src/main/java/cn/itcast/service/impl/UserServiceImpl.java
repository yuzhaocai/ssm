package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.itcast.dao.UserMapper;
import cn.itcast.entity.User;
import cn.itcast.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	public void createUser(User user) {
		userMapper.createUser(user);
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	public void deleteUse(Integer userId) {
		userMapper.deleteUser(userId);
	}

	public User getUser(Integer userId) {
		return userMapper.getUser(userId);
	}

	public User getUserByUsername(String username) {
		return userMapper.getUserByUsername(username);
	}

	public List<User> listUser() {
		return userMapper.listUser();
	}
	
}
