package Homework20.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "steps.RegistrationSteps.java"
)
public class Test2Runner extends AbstractTestNGCucumberTests {

}

