package com.techhub.techhub;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Miroslav Pashaliski on 11/15/2017.
 */
@SpringUI
public class DashboardUI extends UI {

    private VerticalLayout root;

    @Autowired
    DashboadLayout dashboadLayout;

    @Override
    protected void init(VaadinRequest request){
        setUpLayout();
        addHeader();
        addForm();
        addDashboardList();
        addDeleteButton();
    }

    private void setUpLayout() {
        root = new VerticalLayout();
        setContent(root);
    }

    private void addHeader() {
        root.addComponents(new Label("Dashboard"));
    }

    private void addForm(){
        HorizontalLayout formLayout = new HorizontalLayout();

        TextField task = new TextField();
        Button add = new Button("Add");

        formLayout.addComponents(task, add);

        root.addComponent(formLayout);
    }

    private void addDashboardList(){
        root.addComponent(dashboadLayout);
    }

    private void addDeleteButton(){
        root.addComponent(new Button("Delete complete"));
    }
}
