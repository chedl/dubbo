package com.chedl.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chedl.entity.user.User;
import com.chedl.service.user.IUserService;

public class Consumer {
	public static void main(String[] args) throws Exception {
		// 读取Spring配置文件applicationContext.xml，并启动
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-dubbo.xml" });
		context.start();
		// 获取bean
		IUserService userService = (IUserService) context.getBean("userService");
		User user = userService.getUserById(1);
		System.out.println("用户信息：" + user.toString());
	}
}