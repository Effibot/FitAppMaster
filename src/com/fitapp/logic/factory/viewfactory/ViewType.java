package com.fitapp.logic.factory.viewfactory;

import java.net.URL;

public enum ViewType {
	CONTAINER("/com/fitapp/logic/fxml/Container.fxml"),
	LOGIN("/com/fitapp/logic/fxml/Login.fxml");

	private String path;
	private ViewType(String string) {
		this.path = string;
	}

	public static URL getPath(ViewType viewtype) {
		return ViewType.class.getResource(viewtype.path); 
	}

}
