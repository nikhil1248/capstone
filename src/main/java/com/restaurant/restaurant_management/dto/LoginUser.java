package com.restaurant.restaurant_management.dto;

import lombok.Data;

@Data
public class LoginUser {

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
	    
}
