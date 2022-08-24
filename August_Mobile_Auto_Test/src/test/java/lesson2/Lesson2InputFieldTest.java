/*package lesson2;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Lesson2InputFieldTest {


        @Test

        public void checkEmptyEmail() throws MalformedURLException, InterruptedException {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("deviceName", "Pixel" );
            capabilities.setCapability("udid", "emulator-5554" );
            capabilities.setCapability("platformName", "Android" );
            capabilities.setCapability("platformVersion", "10" );
            capabilities.setCapability("app", "E:\\GEEKBRAINS\\Тестирование\\Вне четверти\\Автоматизация тестирования мобильных приложений\\Урок 2. Appium, Android ч. 1\\Android-NativeDemoApp-0.2.1.apk" );

            MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


            MobileElement menuLoginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
            menuLoginButton.click();
            Thread.sleep(2000);
            MobileElement passwordInput = (MobileElement) driver.findElementByAccessibilityId("input-password");
            passwordInput.sendKeys("qwerty");
            Thread.sleep(2000);
            MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
            loginButton.click();
            Thread.sleep(2000);
            MobileElement errorEmailMassage = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");

            Assert.assertEquals(errorEmailMassage.getText(), "Please enter a valid email address");

            driver.quit();
        }

        @Test

        public void testInputField() throws MalformedURLException, InterruptedException {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("deviceName", "Pixel" );
            capabilities.setCapability("udid", "emulator-5554" );
            capabilities.setCapability("platformName", "Android" );
            capabilities.setCapability("platformVersion", "10" );
            capabilities.setCapability("app", "E:\\GEEKBRAINS\\Тестирование\\Вне четверти\\Автоматизация тестирования мобильных приложений\\Урок 2. Appium, Android ч. 1\\Android-NativeDemoApp-0.2.1.apk" );

            MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


            Thread.sleep(2000);
            MobileElement menuFormsButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
            menuFormsButton.click();
            Thread.sleep(2000);
            MobileElement inputField = (MobileElement) driver.findElementByAccessibilityId("text-input");

            inputField.sendKeys("Ivanov");
            Thread.sleep(2000);

            MobileElement youHaveTyped = (MobileElement) driver.findElementByAccessibilityId("input-text-result");
            youHaveTyped.click();

            new TouchAction((PerformsTouchActions) driver);
// Хороший код
            new TouchAction((PerformsTouchActions) driver)
// Точка куда нажимаем и держим
                    .press(PointOption.point(601, 1483))
// Время удержания
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
// Точка куда движется свайп
                    .moveTo(PointOption.point(640, 721))
                    .release()
                    .perform();
            Thread.sleep(2000);
            MobileElement activeButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
            activeButton.click();
            Thread.sleep(2000);
            MobileElement okButton = (MobileElement) driver.findElementById("android:id/button1");
            okButton.click();




            Thread.sleep(2000);
            Assert.assertEquals(youHaveTyped.getText(), "Ivanov");

            driver.quit();

        }
}

*/