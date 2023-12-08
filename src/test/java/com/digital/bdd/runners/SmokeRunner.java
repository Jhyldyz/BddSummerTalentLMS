package com.digital.bdd.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com/digital/bdd/step_defs",
        tags = "@Table1",
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }, // генерирует отчеты
        publish = true // публикует отчеты
)
public class SmokeRunner {
}

