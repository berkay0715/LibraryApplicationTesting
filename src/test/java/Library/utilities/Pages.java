package Library.utilities;

import Library.pages.LoginPage;


public class Pages {

    private LoginPage loginPage;



    public Pages() {
        this.loginPage = new LoginPage();

    }

    public LoginPage loginPage() {
        return loginPage;
    }

}





