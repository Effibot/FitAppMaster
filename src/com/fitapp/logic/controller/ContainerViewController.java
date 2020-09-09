package com.fitapp.logic.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContainerViewController {
	@FXML
    private BorderPane container;

    @FXML
    private VBox topBox;

    @FXML
    private Button reduceButton;

    @FXML
    private Button exitButton;

    @FXML
    private BorderPane topBar;

    @FXML
    private ImageView logOutIcon;

    @FXML
    void onMouseClickedEvent(MouseEvent event) {

    }
    
    @FXML
    void systemAction(ActionEvent event) {
    	if(event.getSource().equals(exitButton)) {
    		Platform.exit();
    		System.exit(0);
    	} else if(event.getSource().equals(reduceButton)) {
    		Stage stage = (Stage) container.getScene().getWindow();
            stage.setIconified(true);
    	}
    }
    @FXML
    private void initialize() {
    	topBox.getChildren().remove(topBar);
    }
}
