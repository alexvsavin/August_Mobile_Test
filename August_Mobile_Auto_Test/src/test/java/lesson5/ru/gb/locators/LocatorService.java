package lesson5.ru.gb.locators;

import lesson5.ru.gb.locators.Android.AndroidLoginPageLocators;
import lesson5.ru.gb.locators.Android.AndroidMainPageLocators;
import lesson5.ru.gb.locators.iOs.iOSLoginPageLocators;
import lesson5.ru.gb.locators.iOs.iOSMainPageLocators;
import lesson5.ru.gb.locators.interfaces.LoginPageLocators;
import lesson5.ru.gb.locators.interfaces.MainPageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();


}
