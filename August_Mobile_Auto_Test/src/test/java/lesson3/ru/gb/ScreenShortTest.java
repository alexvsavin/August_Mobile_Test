package lesson3.ru.gb;

import lesson3.ru.gb.base.BaseTest;
import org.testng.annotations.Test;


public class ScreenShortTest extends BaseTest {

    @Test
    public void createScreen(){
    openApp().makeScreen();

    }

}
