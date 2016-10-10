package com.cedup.dash.model;

import java.security.NoSuchAlgorithmException;

import dash.utils.Utils;

public class UserIntent {
	
	private static int INVALID = 0;
	
	public static int GET_INVALID() {
		int result = INVALID;
		SET_INVALID(0);
		return result;
	}
	
	public static void SET_INVALID(int invalid) {
		INVALID = invalid;
	}
	
	private String login;
	private String password;
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setPassword(String password) throws NoSuchAlgorithmException {
		this.password = Utils.sha1(password);
	}
	
	public String getPassword() {
		return this.password;
	}
}
