package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
    @CucumberOptions(
        features = "C:\\Users\\LEDDANAP\\Downloads\\pom-20231130T124851Z-001\\src\\main\\resources\\features\\JourneyPlanner.feature",

      //  glue = { "src/test/java/stepDefinitions","src/test/java/Hooks"},
            glue={"C:\\Users\\LEDDANAP\\Downloads\\pom-20231130T124851Z-001\\src\\test\\java\\StepDefinitions"},
            //tags = {"~@Ignore"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}

    )

            public class TestRunner extends AbstractTestNGCucumberTests {


}

