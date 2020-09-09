package com.fitapp.logic.decorator;

import javafx.scene.layout.Pane;

import java.io.IOException;

import com.fitapp.logic.factory.viewfactory.ViewType;

public interface View {
    public Pane getRoot();

    public void setRoot(Pane root);

    public void loadView(ViewType type) throws IOException;

    public Pane getLoadedChildren(ViewType type);
}
