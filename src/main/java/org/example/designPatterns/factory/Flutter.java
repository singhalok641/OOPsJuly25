package org.example.designPatterns.factory;

import org.example.designPatterns.factory.enums.Platform;
import org.example.designPatterns.factory.uifactory.AndroidUIFactory;
import org.example.designPatterns.factory.uifactory.UIFactory;
import org.example.designPatterns.factory.uifactory.UIFactoryFactory;
import org.example.designPatterns.factory.uifactory.iOSUIFactory;

public class Flutter {
    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public static UIFactory createFactory(Platform platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}

/*
When should we think of using a Practical Factory


 */
