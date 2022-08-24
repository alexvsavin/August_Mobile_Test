package lesson5.ru.gb.tests.login;

import jdk.jfr.Description;
import lesson5.ru.gb.base.BaseTest;
import lesson5.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckFailErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем поведения теста при падении проверки сообщения об ошибке валидного email")
    public void CheckFailEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}

