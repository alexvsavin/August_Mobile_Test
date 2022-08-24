package lesson7.gb.tests.main;

import lesson7.gb.base.BaseTest;
import lesson7.gb.listeners.AllureListener;
import jdk.jfr.Description;
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

