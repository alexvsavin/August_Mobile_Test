package lesson7.gb.tests.login;

import lesson7.gb.base.BaseTest;
import lesson7.gb.listeners.AllureListener;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void CheckEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}

