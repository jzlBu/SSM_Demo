package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public int save() {
		// TODO Auto-generated method stub
		return userMapper.save();
	}

	@Override
	public List<Object> objects() {
		// TODO Auto-generated method stub
		return userMapper.objects();
	}

	@Override
	public int edit() {
		// TODO Auto-generated method stub
		return userMapper.edit();
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return userMapper.delete();
	}

}
