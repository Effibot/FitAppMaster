package com.fitapp.logic.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

import com.fitapp.logic.decorator.View;
import com.fitapp.logic.factory.viewfactory.ViewType;

public class ContainerView implements View{
    private Pane mainRoot;
    private Map<ViewType, Pane> children = new EnumMap<>(ViewType.class);
    @Override
    public Pane getRoot() {
        return mainRoot;
    }

    @Override
    public void setRoot(Pane root) {
        mainRoot = root;
    }

    @Override
    public void loadView(ViewType type) throws IOException {
        if(!children.containsKey(type)){
            FXMLLoader loader = new FXMLLoader(ViewType.getPath(type));
            Pane root = loader.load();
            if (type == ViewType.CONTAINER) {
                setRoot(root);
            } else {
                children.put(type, root);
            }
        }

    }
    @Override
    public Pane getLoadedChildren(ViewType type) {
        if(children.containsKey(type))
            return children.get(type);
        return null;
    }

    public Map<ViewType, Pane> getChildren(){
        return  children;
    }
}
