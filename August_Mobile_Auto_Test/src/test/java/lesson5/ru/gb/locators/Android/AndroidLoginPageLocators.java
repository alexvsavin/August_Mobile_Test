package lesson5.ru.gb.locators.Android;


import io.appium.java_client.MobileBy;
import lesson5.ru.gb.locators.interfaces.LoginPageLocators;
import org.openqa.selenium.By;

public class AndroidLoginPageLocators implements LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");

    }
}

