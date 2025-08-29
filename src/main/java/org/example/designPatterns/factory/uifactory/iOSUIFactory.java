package org.example.designPatterns.factory.uifactory;

import org.example.designPatterns.factory.ui.button.Button;
import org.example.designPatterns.factory.ui.button.iOSButton;
import org.example.designPatterns.factory.ui.menu.Menu;
import org.example.designPatterns.factory.ui.menu.iOSMenu;

public class iOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }
}
