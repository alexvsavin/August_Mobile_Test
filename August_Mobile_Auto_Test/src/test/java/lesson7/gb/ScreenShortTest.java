package lesson7.gb;

import lesson7.gb.base.BaseTest;
import org.testng.annotations.Test;


public class ScreenShortTest extends BaseTest {

    @Test
    public void createScreen(){
    openApp().makeScreen();

    }

}
