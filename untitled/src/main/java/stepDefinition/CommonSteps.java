package stepDefinition;

import framework.Framework;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CommonSteps {

    @Given("^user opens login page$")
    public void stepLoadWebPage()
    {
        Framework.init();
        Framework.loadWebsite();
    }

    @Then("^take a screenshot '(.*?), '(.*?)'$")
    public void stepTakeScreenshot(String scenario, String testcase){
        Framework.takeScreenShot(scenario, testcase);

    }
}
