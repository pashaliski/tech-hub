package com.techhub.techhub;

import com.techhub.techhub.events.DashboardEventBus;
import com.techhub.techhub.views.LoginView;
import com.vaadin.event.ShortcutAction;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.aspectj.apache.bcel.classfile.Deprecated;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;

/**
 * Created by Miroslav Pashaliski on 11/15/2017.
 */
@SpringUI
public class DashboardUI extends UI {

    private VerticalLayout root;
    private final DashboardEventBus dashboardEventbus = new DashboardEventBus();

    @Autowired
    DashboadLayout dashboadLayout;

    @Autowired
    LoginView loginView;

    @Override
    protected void init(VaadinRequest request){
        setLocale(Locale.US);

        DashboardEventBus.register(this);

        setUpLayout();

        Component login = loginView.buildLoginForm();
        root.addComponent(login);
        root.setComponentAlignment(login, Alignment.MIDDLE_CENTER);

        loginView.loginNotification();
    }

    private void setUpLayout() {
        root = new VerticalLayout();
        root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(root);
    }

    public static DashboardEventBus getDashboardEventbus() {
        return ((DashboardUI) getCurrent()).dashboardEventbus;
    }

}
