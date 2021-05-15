package stepDefinition;

import framework.Framework;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.Dropdown1;
import pages.Login;

public class LoginSteps {

    @Then("^click on free 30 day trail$")
    public void clickOn30dayFreeTrail() {
        Login login = new Login();
        login.click(Framework.getWebDriver());
    }


    @Then("choose country {string}")
    public void chooseCountryIndia(String country) {
        Dropdown1 dropdown1 = new Dropdown1();
        dropdown1.selectDropdownValue(Framework.getWebDriver(), country);

    }
}
