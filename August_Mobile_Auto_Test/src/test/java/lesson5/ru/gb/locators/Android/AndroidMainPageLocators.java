package lesson5.ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import lesson5.ru.gb.locators.interfaces.MainPageLocators;
import org.openqa.selenium.By;

// Класс с локаторами главной/домашней страницы.
public class AndroidMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}

