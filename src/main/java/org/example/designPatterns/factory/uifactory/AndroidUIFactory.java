package org.example.designPatterns.factory.uifactory;

import org.example.designPatterns.factory.ui.button.AndroidButton;
import org.example.designPatterns.factory.ui.button.Button;
import org.example.designPatterns.factory.ui.menu.AndroidMenu;
import org.example.designPatterns.factory.ui.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
