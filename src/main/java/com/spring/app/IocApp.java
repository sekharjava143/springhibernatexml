package com.spring.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;
import com.spring.bean.UserDao;

public class IocApp {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeans.xml");

		User usr = new User();
		usr.setName("SANJEEV");
		usr.setCity("CHENNAI");

		UserDao userDao = (UserDao) appCtx.getBean("userDao");
		userDao.saveUser(usr);

		List<User> allUsers = userDao.list();
		for (User u : allUsers)
			System.out.println("UserId: " + u.getUserId()+ "\tUser name: " + u.getName());
	}
}
