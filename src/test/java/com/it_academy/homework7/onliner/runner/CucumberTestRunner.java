package com.it_academy.homework7.onliner.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/CucumberOnlinerTestRunner.html",
                "json:target/cucumber-reports/CucumberOnlinerTestRunner.json",
                "junit:target/cucumber-reports/CucumberOnlinerTestRunner.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "com.it_academy.homework7.onliner",
        features = "classpath:features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}