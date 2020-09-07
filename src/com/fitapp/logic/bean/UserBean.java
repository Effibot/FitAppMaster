package com.fitapp.logic.bean;

import java.util.Observable;
import java.util.Observer;

public class UserBean implements Observer{
	private Integer userId;
	
	private String userName;
	
	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setUserName(String name) {
		this.userName = name;
	}
	public String getUserName() {
		return userName;
	}
	
	@Override
	public void update(Observable o, Object object) {
		if(object.getClass() == Integer.class)
			setUserId((Integer)object);
		else if(object instanceof String)
			setUserName((String)object);
	}


}
