package com.fitapp.logic.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fitapp.logic.bean.UserBean;
import com.fitapp.logic.model.UserModel;

public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		model.setId(1);
		model.setName("dada");
		LOGGER.info("Model id> {}", model.getId());
		LOGGER.info("Model name> {}", model.getName());
		LOGGER.info("adding observer");
		model.addObserver(bean);
		LOGGER.info("changing values");
		model.setId(5);
		model.setName("monkaS");
		LOGGER.info("Model id> {}", model.getId());
		LOGGER.info("Model name> {}", model.getName());
		LOGGER.info("Observed id> {}", bean.getUserId());
		LOGGER.info("Observed name> {}", bean.getUserName());

	}

}
