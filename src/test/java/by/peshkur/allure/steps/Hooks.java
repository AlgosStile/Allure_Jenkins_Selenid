package by.peshkur.allure.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl() {
        Selenide.open("https://avito.ru");
        Selenide.$("a[data-marker='header/login-button']").click();
    }
}
