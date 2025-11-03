package com.calidda.planQ.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@TC648",
        features = "src/test/resources/features",
        glue = "com.calidda.planQ"
)

public class LoginRunner {
}
