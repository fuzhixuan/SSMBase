package com.mapper;

import com.pojo.User;

public interface UserMapper {
	public User findById(String userId) throws Exception;
}