package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.BasePage;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.FilesPage;
import com.digital.pages.usersPage.components.EditFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditFileTest extends UserHomePageTest {
    EditFile editFile=  new EditFile();
    @Test(priority = 1)
    void test1(){
        editFile.clickName();
        editFile.clickFile();
        editFile.clickTable1();
        editFile.clickPreview();
        editFile.clickTable1();
        editFile.clickDownload();
        editFile.clickFile();
        editFile.clickTable1();
        editFile.clickEdit();
        editFile.clickTable1();
        editFile.deleteClick();
    }
//    @Test(priority = 2)
//    void fileTestAssert(){
//        editFile.clickName();
//        editFile.clickFile();
//        editFile.clickTable1();
//        editFile.clickPreview();
//        Assert.assertEquals(editFile.pictureNameText,"kitty.jpg");
//        editFile.clickTable1();
//        editFile.clickDownload();
////        Assert.assertEquals(editFile.editTexte,"Update");
//        editFile.clickFile();
//        editFile.clickTable1();
//        editFile.clickEdit();
//        Assert.assertEquals(editFile.editTexte,"Update");
//        editFile.clickTable1();
//        editFile.deleteClick();
//        Assert.assertEquals(editFile.textUpdate,"Are you sure you want to delete the file kitty.jpg?");

    }

//}
