package com.digital.bdd.step_defs;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.models.CategoriesPojo;
import com.digital.models.UserPojo;
import com.digital.pages.categoriesPage.AddCategoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


import java.util.List;
import java.util.Map;

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

    //    @Given("create new categories up with following categoriesPojo")
//    public void create_new_categories_up_with_following_categories_pojo(List<Map<String, String>> categoriesData) {
//        for (Map<String, String> entry : categoriesData) {
//            CategoriesPojo categoriesPojo = createCategoriesFromMap(entry);
//            System.out.println(categoriesPojo.getCategoriesName());
//        }
//    }
//    private CategoriesPojo createCategoriesFromMap(Map<String, String> entry) {
//        return new CategoriesPojo(
//                entry.get("categoriesName"),
//                entry.get("parentCategories"),
//                entry.get("price")
//        );
    @Given("user should enter categoriesName {string}")
    public void user_should_enter_categories_name(String string) {
        addCategoryPage.fieldNameInput.sendKeys(string);
    }

    @Given("user should enter parentCategories")
    public void user_should_enter_parent_categories() {
        addCategoryPage.chooseParentCategory();
    }

    @Given("user should enter price {string}")
    public void user_should_enter_price(String string) {
        addCategoryPage.priceBtn.click();
        addCategoryPage.fillUpFieldPriceInput();
    }

    @Given("user clicks the addCategories button")
    public void user_clicks_the_add_categories_button() {
        addCategoryPage.clickAddNewCategoryBtn();
        Assertions.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("CATEGORY_URL")));
    }
}

