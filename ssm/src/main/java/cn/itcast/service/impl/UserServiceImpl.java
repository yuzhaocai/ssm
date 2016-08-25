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
	
	public List<User> selectUsers(){
		PageHelper.startPage(1, 10);
		return userMapper.selectUsers();
	}
}
