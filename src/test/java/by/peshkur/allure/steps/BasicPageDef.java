package by.peshkur.allure.steps;

import by.peshkur.allure.pages.BasicPage;
import io.cucumber.java.en.Then;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

}
