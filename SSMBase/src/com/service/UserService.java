package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;

@Service("userService")
public class UserService {
	@Resource
	private UserMapper dao;

	public User findById(String userId) throws Exception {
		return dao.findById(userId);
	}
}
