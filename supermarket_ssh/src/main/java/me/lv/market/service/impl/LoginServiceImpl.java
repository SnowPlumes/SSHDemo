package me.lv.market.service.impl;

import me.lv.market.service.LoginService;

public class LoginServiceImpl implements LoginService {

	public boolean login(String name, String password) {
		if ("1".equals(name) && "1".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
