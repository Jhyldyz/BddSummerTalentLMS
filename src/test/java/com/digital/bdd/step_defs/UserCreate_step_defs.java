package com.digital.bdd.step_defs;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.LoginPage;
import com.digital.pages.usersPage.CreateUserPage;
import io.cucumber.java.en.Given;
public class UserCreate_step_defs {
    LoginPage loginPage =  new LoginPage();
    CreateUserPage createUserPage  = new CreateUserPage();
    @Given("click add user button")
    public void clickAddUserButton() {
        createUserPage.addUserBtn.click();
    }
    @Given("enter firstname {string}")
    public void enter_firstname(String string) {
        createUserPage.firstNameInput.sendKeys(string);
    }
    @Given("enter lastname {string}")
    public void enter_lastname(String string) {
        createUserPage.lastNameInput.sendKeys(string);
    }
    @Given("enter email {string}")
    public void enter_email(String string) {
        createUserPage.emailInput.sendKeys(string);
    }
    @Given("enter bio {int}")
    public void enter_bio(Integer int1) {
        createUserPage.bioInput.sendKeys(String.valueOf(int1));
    }
    @Given("go to login")
    public void goToLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
    }
}