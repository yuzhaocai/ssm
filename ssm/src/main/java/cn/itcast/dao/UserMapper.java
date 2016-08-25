package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.User;

public interface UserMapper {
	
	public List<User> selectUsers();
}
