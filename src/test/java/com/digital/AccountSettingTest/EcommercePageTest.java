package com.digital.AccountSettingTest;

import com.digital.pages.accountSettingsPage.EcommercePage;
import org.testng.annotations.Test;

public class EcommercePageTest extends AccountSettingsEnter {
    @Test(priority = 1)
    void openOption(){
        ecommercePage = new EcommercePage();
         ecommercePage.enterEcommerce()
//                 .openOptionsEcommerce()
//                 .selectRandom()
//                 .selectRandom()
                 .showDiscount()
                 .checkedDiscount()
                 .discountPercentage()
                 .showDiscount()
                 .showInvoices()
                 .checkboxInvoices()
                 .invoicesSendMessage()
                 .showCoupons()
//                 .addCouponButton()
                 .showCredits()
                 .creditsChecked()
                 .creditsAdd()
                 .radioBtnAllUsers()
                 .radioBtnSpecificUsers()
                 .specificUser();
//                 .elementActions.navigateBack()
    }

    @Test(priority = 2)
    void timeLine(){
        driver.get("https://nbu111.talentlms.com/reports/timeline/mode:ecommerce");
        ecommercePage = new EcommercePage();
        ecommercePage.selectRandomDate();
    }
}
