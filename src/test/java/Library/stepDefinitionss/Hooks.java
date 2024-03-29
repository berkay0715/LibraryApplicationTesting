package Library.stepDefinitionss;

import Library.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java not from JUnit
    @Before(order = 1)
    public void setupScenario(){

        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before(value = "@login",order = 2)
    public void setUpScenarioForLoginS(){
        System.out.println("====This will only apply to scenarios with @login tag");
    }
    @Before(value = "@db",order = 0)
    public void setUpForDatabaseScenarios() {
        System.out.println("====This will only apply to scenarios with @db tag");
    }
    @After
    public void TeardownScenario(Scenario scenario){

        // if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES); //this is for screenshot
            scenario.attach(screenshot,"image/png",scenario.getName());
        }



        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
        // System.out.println("==== Scenario ended / Take screenshot if failed!");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("-------> applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterSetup(){
        System.out.println("-------> applying teardown using @AfterStep");
    }

}
