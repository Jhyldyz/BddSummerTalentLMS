package com.digital.bdd.step_defs;

import com.digital.pages.coursesPage.CreateCoursePage;
import io.cucumber.java.en.Given;

public class CourseCreate_step_defs {
    CreateCoursePage createCoursePage = new CreateCoursePage();

    @Given("click add course button")
    public void click_add_course_button() {
        createCoursePage.addCoursePage.click();
    }

    @Given("enter coursename {string}")
    public void enter_coursename(String string) {
        createCoursePage.courseNameInput.sendKeys(string);
    }

    @Given("choose course category  {string}")
    public void choose_course_category(String string) {
        createCoursePage.choosyCategory(string);
    }

    @Given("fill up description field  {string}")
    public void fill_up_description_field(String string) {
        createCoursePage.descriptionInput.sendKeys(string);
    }

    @Given("click save and select button")
    public void click_save_and_select_button() {
        createCoursePage.saveBtn();
    }
}

