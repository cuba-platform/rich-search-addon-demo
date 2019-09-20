package com.haulmont.demo.richsearch.web.screens;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.web.app.main.MainScreen;

@Route(path = "main", root = true)
@UiDescriptor("ext-mainwindow.xml")
@UiController("main")
public class ExtAppMainWindow extends MainScreen {
}