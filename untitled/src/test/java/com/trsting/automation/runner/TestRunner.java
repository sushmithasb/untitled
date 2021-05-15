package com.trsting.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"stepDefinition"},
        //tags = "@All",
        plugin = {"pretty"//,
                    //"json:target/MyReports/report.json",   //basic report provided by cucumber
                    //"junit:target/MyReports/report.xml"       //basic report provided by cucumber
        },
        publish = false ,   //web report-basic report provided by cucumber
        dryRun = false      // tells which step in missing in step definition and doest not execute the test cases


)

public class TestRunner {
}
