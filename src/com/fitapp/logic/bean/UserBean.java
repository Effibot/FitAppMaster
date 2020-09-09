package com.fitapp.logic.bean;

import java.util.Observable;
import java.util.Observer;

import com.fitapp.logic.model.UserModel;
import com.fitapp.logic.model.UserModel.ChangedValue;

public class UserBean implements Observer {
	
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPosition;
	private String userPassword;
	private Boolean isManager;
	
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}

	@Override
	public void update(Observable o, Object object) {
		if (o instanceof UserModel && object instanceof ChangedValue) {
			UserModel model = (UserModel) o;
			ChangedValue changed = (ChangedValue) object;

			switch (changed) {
			case ID:
				setUserId(model.getId());
				break;
			case NAME:
				setUserName(model.getName());
				break;
			case EMAIL:
				setUserEmail(model.getEmail());
				break;
			case PWD:
				setUserPassword(model.getPwd());
				break;
			case MYPOSITION:
				setUserPosition(model.getMyPosition());;
				break;
			case MANAGER:
				setIsManager(model.isManager());
				break;
			default:
				throw new IllegalStateException("Unexpected ChangedValue type> " + changed);
			}
		}
	}
}
