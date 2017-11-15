package com.techhub.techhub;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Miroslav Pashaliski on 11/15/2017.
 */
@SpringUI
public class DashboardUI extends UI {
    private VerticalLayout root;

    @Override
    protected void init(VaadinRequest request){
        setUpLayout();
        addHeader();
    }

    private void setUpLayout() {
        root = new VerticalLayout();
        setContent(root);
    }

    private void addHeader() {
        root.addComponents(new Label("Dashboard"));
    }
}
