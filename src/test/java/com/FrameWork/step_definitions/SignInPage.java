package com.FrameWork.step_definitions;

import com.FrameWork.utilities.ConfigurationReader;
import com.FrameWork.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class SignInPage extends BaseStep{
    @Given("Open browser go to {string} url")
    public void openBrowserGoToUrl(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));

    }

    @And("User clicks the Join button")
    public void userClicksTheJoinButton() {

    }

    @And("User clicks the Sing up button")
    public void userClicksTheSingUpButton() {
    }

    @And("User enters {string} to email adress box and  {string} to password box")
    public void userEntersToEmailAdressBoxAndToPasswordBox(String arg0, String arg1) {
    }

    @And("User clicks to the Terms of Service and Privacy Policy checkbox")
    public void userClicksToTheTermsOfServiceAndPrivacyPolicyCheckbox() {
    }

    @And("User clicks the Create Account button")
    public void userClicksTheCreateAccountButton() {
    }

    @And("User open the email adress and clicks the {string}")
    public void userOpenTheEmailAdressAndClicksThe(String arg0) {
    }


    @And("User verifies that Sign in page open {string}")
    public void userVerifiesThatSignInPageOpen(String arg0) {
    }
}
