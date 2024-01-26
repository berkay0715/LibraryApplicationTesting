package Library.stepDefinitionss;

import Library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LibraryStepDefinitions extends BaseStep {

    @When("User clicks Details on the book they should be able to see that the book is available")
    public void user_clicks_details_on_the_book_they_should_be_able_to_see_that_the_book_is_available() {
        BrowserUtils.wait(2);
        pages.loginPage().detailsButton.click();
        pages.loginPage().availableButton.click();
        Assert.assertTrue(pages.loginPage().availableButton.isDisplayed());

    }
    @When("User should be able to click on available to book the book")
    public void user_should_be_able_to_click_on_available_to_book_the_book() {
        BrowserUtils.wait(2);
        pages.loginPage().availableButton.click();
    }

    @When("User should see that a book that is taken is not available")
    public void user_should_see_that_a_book_that_is_taken_is_not_available() {
        Assert.assertTrue(pages.loginPage().notAvailableButton.isDisplayed());
    }

    @When("User should be able to click on return it back and return the book")
    public void user_should_be_able_to_click_on_return_it_back_and_return_the_book() {
        pages.loginPage().returnItBackButton.click();

    }

    @When("User clicks on search bar they should click on it")
    public void user_clicks_on_search_bar_they_should_click_on_it() {
    pages.loginPage().searchBar.click();

    }
    @Then("User should be able to search for a book")
    public void user_should_be_able_to_search_for_a_book() {
        pages.loginPage().searchBar.sendKeys("Pride and Prejudice");
    }


}
