package com.fitapp.logic.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fitapp.logic.bean.UserBean;
import com.fitapp.logic.model.UserModel;

public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		UserBean bean = new UserBean();

		UserModel model = new UserModel(bean);
		model.setId(1);
		model.setName("dada");
		model.setEmail("prev email");
		LOGGER.info("Model id> {}", model.getId());
		LOGGER.info("Model name> {}", model.getName());
		LOGGER.info("Model email> {}", model.getEmail());
		LOGGER.info("Observed id> {}", bean.getUserId());
		LOGGER.info("Observed name> {}", bean.getUserName());
		LOGGER.info("Observed email> {}", bean.getUserEmail());
		LOGGER.info("adding observer");
		//model.addObserver(bean);
		LOGGER.info("changing values");
		model.setId(5);
		model.setName("monkaS");
		model.setEmail("new email");
		LOGGER.info("Model id> {}", model.getId());
		LOGGER.info("Model name> {}", model.getName());
		LOGGER.info("Model email> {}", model.getEmail());
		LOGGER.info("Observed id> {}", bean.getUserId());
		LOGGER.info("Observed name> {}", bean.getUserName());
		LOGGER.info("Observed email> {}", bean.getUserEmail());

	}

}
