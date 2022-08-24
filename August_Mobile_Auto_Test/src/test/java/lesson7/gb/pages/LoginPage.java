package lesson7.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import lesson7.gb.locators.LoginPageLocators;
import io.qameta.allure.Step;

public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по кнопке логин в форме")
    public LoginPage clickLoginButton() {
        Selenide.$(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        Selenide.$(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
}

