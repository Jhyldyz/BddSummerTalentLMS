package com.digital.bdd.step_defs;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.categoriesPage.AddCategoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


import java.util.List;

public class Categories_step_defs {
    AddCategoryPage addCategoryPage = new AddCategoryPage();
    ElementActions elementActions = new ElementActions();

    @Given("click add categories button")
    public void click_add_categories_button() {
        addCategoryPage.clickAddCategoryBtnOnHomePage();
    }

    @Given("enter categories name {string}")
    public void enter_categories_name(String nameCategories) {
        addCategoryPage.fieldNameInput.sendKeys(nameCategories);
    }

    @Given("choose parent categories")
    public void choose_parent_categories() {
        elementActions.clickToRandomElement(List.of(addCategoryPage.fieldParentCategory));
        elementActions.clickElement(addCategoryPage.firstSelectParentCategory);
    }

    @When("click add new categories button")
    public void click_add_new_categories_button() {
        addCategoryPage.clickAddNewCategoryBtn();
    }

    @Then("user should successfully add categories")
    public void user_should_successfully_add_categories() {
        Assertions.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("CATEGORY_URL")));
    }
    @Given("enter categories invalid name {string}")
    public void enter_categories_invalid_name(String invalidNameCategories) {
        addCategoryPage.fieldNameInput.sendKeys(invalidNameCategories);
    }
    @Then("the user get a message")
    public void the_user_get_a_message() {
        Assertions.assertTrue(addCategoryPage.expectedTextWithInvalidName.getText().contains("'Name' cannot exceed 80 characters"));
    }

}
