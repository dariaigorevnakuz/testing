package at.course.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "at.course.stepDefenitions",
        features = "/Users/dariakuznetsova/IdeaProjects/testing/src/test/resources/features")

public class RunTest {
}
