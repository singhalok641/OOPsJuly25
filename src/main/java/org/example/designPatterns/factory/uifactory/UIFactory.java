package org.example.designPatterns.factory.uifactory;

import org.example.designPatterns.factory.ui.button.Button;
import org.example.designPatterns.factory.ui.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}

/*

Notification

email -> <<emailAPI>>
emailAPI interface will be implemented by 2 different providers

sms -> <<SMS API>>


Payment -> <<PaymentGateway>>

RazorpayPG, StripePG
 */