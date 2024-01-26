package Library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded']")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500']")
    public WebElement signInButton;

    @FindBy(xpath = "(//button[.='Details'])[2]")
    public WebElement detailsButton;

    @FindBy(xpath = "//button[.='Available']")
    public WebElement availableButton;

    @FindBy(xpath = "//button[.='Return It Back']")
    public WebElement returnItBackButton;

    @FindBy(xpath = "//button[.='Not Available']")
    public WebElement notAvailableButton;

    @FindBy(xpath = "//input[@class='w-full p-3 border rounded shadow text-black']")
    public WebElement searchBar;


}
