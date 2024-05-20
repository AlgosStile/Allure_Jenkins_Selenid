package by.peshkur.allure.pages;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text) {
        $("input[data-marker='login-form/login/input']").setValue("+79663758587");
        $("input[data-marker='login-form/password/input']").setValue("dgdhdklrOL12");
        $("button[data-marker='login-form/submit']").click();

    }

}
