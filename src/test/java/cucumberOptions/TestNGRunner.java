package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",
monochrome =true,tags = "@SmokeTest or @Regression",plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

//@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome =true,tags = "not @Regression")
//public class TestNGRunner extends AbstractTestNGCucumberTests {
//
//}
  