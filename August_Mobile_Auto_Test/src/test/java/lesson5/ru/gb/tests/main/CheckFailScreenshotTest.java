package lesson5.ru.gb.tests.main;

import jdk.jfr.Description;
import lesson5.ru.gb.base.BaseTest;
import lesson5.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем поведение теста при неудачной проверке UI главной страницы с помощью скриншота.")
    public void CheckFailMainPageScreenshot() {
        openApp()
                .checkFailScreenshot();
    }
}

