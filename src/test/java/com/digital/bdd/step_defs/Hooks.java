package com.digital.bdd.step_defs;
import com.digital.driver.Driver;
import com.digital.helper.ScreenShotMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
public class Hooks {
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenShots = ((TakesScreenshot) new ScreenShotMethods().driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenShots, "image/png", "screenshot");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
        }
        Driver.closeDriver();
    }
}








