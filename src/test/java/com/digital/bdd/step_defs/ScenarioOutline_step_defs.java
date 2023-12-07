package com.digital.bdd.step_defs;
import com.digital.pages.LoginPage;
import io.cucumber.java.en.Given;
public class ScenarioOutline_step_defs {
    LoginPage loginPage = new LoginPage();
    @Given("user should enter username or email admin")
    public void user_should_enter_username_or_email_admin(String string) {
        loginPage.loginInput.sendKeys(string);    }
    @Given("user should enter password Admin1234!")
    public void user_should_enter_password_admin1234(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
}
