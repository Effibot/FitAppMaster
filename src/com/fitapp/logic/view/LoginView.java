package com.fitapp.logic.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

import com.fitapp.logic.decorator.View;
import com.fitapp.logic.decorator.ViewDecorator;
import com.fitapp.logic.factory.viewfactory.ViewType;

public class LoginView extends ViewDecorator{

    private BorderPane parentRoot;


    public LoginView(View view) {
        super(view);
        loadView(ViewType.LOGIN);
    }

    @Override
    public void setRoot(Pane root) {
        parentRoot = (BorderPane) root;
    }

    @Override
    public void loadView(ViewType type) {
        try {
            super.loadView(type);
            setRoot(super.getRoot());
            parentRoot.setCenter(super.getLoadedChildren(type));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
