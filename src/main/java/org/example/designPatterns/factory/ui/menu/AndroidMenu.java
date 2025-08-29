package org.example.designPatterns.factory.ui.menu;

import org.example.designPatterns.factory.enums.Platform;

public class AndroidMenu implements Menu{
    @Override
    public void printMenuType() {
        System.out.println(Platform.ANDROID);
    }
}
