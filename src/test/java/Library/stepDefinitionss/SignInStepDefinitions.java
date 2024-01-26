package Library.stepDefinitionss;

import Library.utilities.BrowserUtils;
import Library.utilities.ConfigurationReader;
import Library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SignInStepDefinitions extends BaseStep {


    @Given("Open browser go to {string} url")
    public void open_browser_go_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }
    @Given("User clicks the Login button")
    public void user_clicks_the_login_button() {
        pages.loginPage().loginButton.click();
    }
    @Given("User enters username and  password")
    public void user_enters_username_and_password() {
       pages.loginPage().usernameInput.click();
       pages.loginPage().usernameInput.sendKeys("test");
       pages.loginPage().passwordInput.click();
       pages.loginPage().passwordInput.sendKeys("test");
    }
    @Given("User clicks the Sing in button")
    public void user_clicks_the_sing_in_button() {
        pages.loginPage().signInButton.click();
    }



}

