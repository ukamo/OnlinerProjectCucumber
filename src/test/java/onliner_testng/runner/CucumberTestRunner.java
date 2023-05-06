package onliner_testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/CucumberOnlinerTestRunner.html",
                "json:target/cucumber-reports/CucumberOnlinerTestRunner.json",
                "junit:target/cucumber-reports/CucumberOnlinerTestRunner.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "onliner_testng",
        features = "classpath:com.it_academy.homework7.onliner"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}