package com.digital.pages.categoriesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddCategoryPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://nbu111.talentlms.com/category/create']")
    public WebElement addCategoryBtnOnHomePage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement fieldNameInput;

    @FindBy(xpath = "//span[@class='select2-chosen']")
    public WebElement fieldParentCategory;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement firstSelectParentCategory;

    @FindBy(xpath = "//a[@id='show-price']")
    public WebElement priceBtn;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement fieldPriceInput;

    @FindBy(xpath = "//input[@name='submit_category']")
    public WebElement addNewCategoryBtn;

    @FindBy(xpath = "//tr[@class='even']//div[@class='tl-table-operations-trigger touchable']//i[@class='icon-ellipsis-h tl-table-operations-icon']")
    public WebElement newAddedCategoryOptions;

    @FindBy(xpath = "(//i[@alt='Delete'])[2]")
    public WebElement newAddedCategoryOptionsDeleteBtn;

    @FindBy(xpath = "//a[@id='tl-confirm-submit']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//label[text()='Name']")
    public WebElement expectedTextName;

    @FindBy(xpath = "//span[text()='78']")
    public WebElement expectedAfterFillUpFieldNameInput;

    @FindBy(xpath = "//label[text()='Parent category']")
    public WebElement expectedChooseParentCategory;

    @FindBy(xpath = "//span[text()='$']")
    public WebElement expectedAfterClickPriceBtn;

    @FindBy(xpath = "//label[text()='Price']")
    public WebElement expectedAfterFillUpFieldPriceInput;

    @FindBy(xpath = "//a[text()='QA']")
    public WebElement expectedAfterClickAddNewCategoryBtn;

    @FindBy(xpath = "//span[@class='help-inline']")
    public WebElement expectedTextWithInvalidName;


    public AddCategoryPage clickAddCategoryBtnOnHomePage(){
        elementActions.clickElement(addCategoryBtnOnHomePage);
        return this;
    }
    public AddCategoryPage fillUpFieldNameInput(){
        elementActions.waitElementToBeVisible(fieldNameInput)
                .writeText(fieldNameInput,"QA");
        return this;
    }
    public AddCategoryPage chooseParentCategory(){
        elementActions.clickToRandomElement(List.of(fieldParentCategory));
        elementActions.clickElement(firstSelectParentCategory);
        return this;
    }
    public AddCategoryPage clickPriceBtn(){
        elementActions.clickElement(priceBtn);
        return this;
    }
    public AddCategoryPage fillUpFieldPriceInput(){
        elementActions.writeText(fieldPriceInput,"500");
        return this;
    }
    public AddCategoryPage clickAddNewCategoryBtn(){
        elementActions.clickElement(addNewCategoryBtn);
        return this;
    }
    private AddCategoryPage hoverMouseToNewAddedCategoryOptionsBtn(){
        elementActions.moveToElement(newAddedCategoryOptions);
        return this;
    }
    public AddCategoryPage clickNewAddedCategoryOptionsDeleteBtn(){
        AddCategoryPage addCategoryPage = new AddCategoryPage();
        addCategoryPage.hoverMouseToNewAddedCategoryOptionsBtn();
        elementActions.clickElement(newAddedCategoryOptionsDeleteBtn);
        return this;
    }
    public AddCategoryPage clickDeleteBtn(){
        elementActions.clickElement(deleteBtn);
        return this;
    }

}