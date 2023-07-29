package com.journaldev.bootifulmongodb.dal;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("avtar1326") && password.equals("abc123");
	}
	
	
}
