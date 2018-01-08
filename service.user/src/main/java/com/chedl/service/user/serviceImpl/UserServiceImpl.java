package com.chedl.service.user.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import com.chedl.entity.user.User;
import com.chedl.service.user.IUserService;

public class UserServiceImpl implements IUserService {
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("张三");
		user1.setAge(24);
		user1.setPassword("123456");
		User user2 = new User();
		user2.setId(2);
		user2.setUserName("李四");
		user2.setAge(25);
		user2.setPassword("654321");
		userList.add(user1);
		userList.add(user2);
		for (User user : userList) {
			if (user.getId() == userId) {
				return user;
			}
		}
		return null;
	}
}
