package lesson3.ru.gb.tests.main;

import jdk.jfr.Description;
import lesson3.ru.gb.base.BaseTest;
import lesson3.ru.gb.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота.")
    public void CheckMainPageScreenshot() {
        openApp()
                .checkScreenshot();
    }
}

