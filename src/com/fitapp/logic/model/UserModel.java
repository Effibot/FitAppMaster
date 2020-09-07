package com.fitapp.logic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class UserModel extends Observable {

	private int id;
	private String name;
	private String pwd;
	private String email;
	private String myPosition;
	private boolean manager;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		setChanged();
		notifyObservers(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMyPosition() {
		return this.myPosition;
	}

	public void setMyPosition(String position) {
		this.myPosition = position;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return String.format("user: '%s' %nemail: '%s' %npassword: '%s' %nmanager: '%b'", this.name, this.email,
				this.pwd, this.manager);
	}

}
