package com.zensar.entities;

import org.springframework.stereotype.Component;

/**
 * @author akansh_sai
 * @creation date 11th oct 2019 15:34pm
 * @version 1.0
 *
 */
@Component
public class User {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
