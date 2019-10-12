package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;
/**
 * @author akansh_sai
 * @creation date 11th oct 2019 15:34pm
 * @version 1.0
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		if(user.getUsername().equals("akansh")&& user.getPassword().equals("123")) {
			
			return true;	
		}
		else {
			return false;
			}
		
	}

}
