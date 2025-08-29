package org.example.designPatterns.factory;

import org.example.designPatterns.factory.enums.Platform;
import org.example.designPatterns.factory.ui.button.Button;
import org.example.designPatterns.factory.uifactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(Platform.ANDROID);

        Button b = uiFactory.createButton();
        b.printButtonType();
    }
}
