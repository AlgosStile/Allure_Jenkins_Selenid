package by.peshkur.allure.pages;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text) {
        $("input[data-marker='login-form/login/input']").setValue("your_logit_name");
        $("input[data-marker='login-form/password/input']").setValue("password");
        $("button[data-marker='login-form/submit']").click();

    }

}
