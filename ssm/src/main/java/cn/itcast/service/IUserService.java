package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.User;

public interface IUserService {
	
	public List<User> selectUsers();
}
