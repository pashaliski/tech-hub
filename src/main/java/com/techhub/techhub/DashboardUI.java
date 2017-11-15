package com.techhub.techhub;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
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
        root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(root);
    }

    private void addHeader() {
        Label header = new Label("Dashboard");
        header.addStyleName(ValoTheme.LABEL_H1);
        root.addComponents(header);
    }

    private void addForm(){
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setWidth("80%");

        TextField task = new TextField();
        Button add = new Button("");
        add.addStyleName(ValoTheme.BUTTON_PRIMARY);
        add.setIcon(VaadinIcons.PLUS);

        formLayout.addComponentsAndExpand(task);
        formLayout.addComponents(add);

        root.addComponent(formLayout);
    }

    private void addDashboardList(){
        dashboadLayout.setWidth("80%");
        root.addComponent(dashboadLayout);
    }

    private void addDeleteButton(){
        root.addComponent(new Button("Delete complete"));
    }
}
