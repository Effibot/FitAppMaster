package com.fitapp.logic.model;

import java.util.Observable;

import com.fitapp.logic.bean.UserBean;

public class UserModel extends Observable {
	/**
	 * This class represents a concrete observable subject. It defines an enum of
	 * attributes that helps observers of this class to identify which attribute is
	 * changed.
	 * 
	 * @author Andrea Efficace.
	 */

	private Integer id;
	private String name;
	private String pwd;
	private String email;
	private String myPosition;
	private Boolean manager;

	public enum ChangedValue {
		ID, NAME, EMAIL, PWD, MYPOSITION, MANAGER;
	}
	
	
	
	public UserModel(UserBean bean) {
		super();
		this.addObserver(bean);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		setChanged();
		notifyObservers(ChangedValue.ID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(ChangedValue.NAME);
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
		setChanged();
		notifyObservers(ChangedValue.PWD);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		setChanged();
		notifyObservers(ChangedValue.EMAIL);
	}

	public String getMyPosition() {
		return this.myPosition;
	}

	public void setMyPosition(String position) {
		this.myPosition = position;
		setChanged();
		notifyObservers(ChangedValue.MYPOSITION);
	}

	public Boolean isManager() {
		return manager;
	}

	public void setManager(Boolean manager) {
		this.manager = manager;
		setChanged();
		notifyObservers(ChangedValue.MANAGER);
	}

	@Override
	public String toString() {
		return String.format("user: '%s' %nemail: '%s' %npassword: '%s' %nmanager: '%b'", this.name, this.email,
				this.pwd, this.manager);
	}

}
