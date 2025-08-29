package org.example.designPatterns.factory.uifactory;

import org.example.designPatterns.factory.enums.Platform;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        return switch (platform) {
            case IOS -> new iOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
