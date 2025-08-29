package org.example.designPatterns.factory.ui.button;

import org.example.designPatterns.factory.enums.Platform;

public class iOSButton implements Button{
    @Override
    public void changeSize() {

    }

    @Override
    public void printButtonType() {
        System.out.println(Platform.IOS);
    }
}
