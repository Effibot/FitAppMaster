package com.fitapp.logic.facade.application;

import javafx.scene.Parent;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

import com.fitapp.logic.decorator.View;
import com.fitapp.logic.factory.viewfactory.ViewType;
import com.fitapp.logic.view.ContainerView;
import com.fitapp.logic.view.LoginView;

public class ApplicationFacade {

    private Map<ViewType, View> viewMap = new EnumMap<>(ViewType.class);
    private static ApplicationFacade instance;

    public static synchronized ApplicationFacade getInstance() {
        if (instance == null) {
            instance = new ApplicationFacade();
        }
        return instance;
    }

    private ContainerView simpleView;

    private ApplicationFacade() {
        initSimpleView();
    }

    public void initSimpleView() {
        this.simpleView = new ContainerView();
        try {
            this.simpleView.loadView(ViewType.CONTAINER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Parent getSimpleView() {
        return simpleView.getRoot();
    }

    public void decorateView(ViewType type) {
        switch (type) {
            case LOGIN:
                LoginView loginView = new LoginView(simpleView);
                viewMap.put(type, loginView);
                break;
            default:
                break;
        }
    }

    public Map<ViewType, View> getViewMap() {
        return viewMap;
    }

    public void setViewMap(Map<ViewType, View> viewMap) {
        this.viewMap = viewMap;
    }


    //    public void undecorateView(ViewType type) {
//        View view = viewMap.get(type);
//        switch (type){
//            case LOGIN:
//                view.getRoot().getChildren().remove(view.getLoadedChildren(type));
//                break;
//            default:
//                break;
//        }
//    }
    public void logOut() {
        simpleView.getChildren().clear();
        decorateView(ViewType.LOGIN);
    }
}
