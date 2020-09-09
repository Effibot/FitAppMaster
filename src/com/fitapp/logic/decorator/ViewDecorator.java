package com.fitapp.logic.decorator;

import javafx.scene.layout.Pane;

import java.io.IOException;

import com.fitapp.logic.factory.viewfactory.ViewType;

public abstract class ViewDecorator implements View{
    View view;

    public ViewDecorator(View view) {
        this.view = view;
    }

    @Override
    public Pane getRoot() {
        return this.view.getRoot();
    }

    @Override
    public void loadView(ViewType type) throws IOException {
        this.view.loadView(type);
    }

    @Override
    public Pane getLoadedChildren(ViewType type) {
        return this.view.getLoadedChildren(type);
    }


}
