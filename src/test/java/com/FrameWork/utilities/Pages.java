package com.FrameWork.utilities;

import com.FrameWork.step_definitions.LibraryStepDefinitions;
import com.FrameWork.step_definitions.SignInPage;


public class Pages {

    private LibraryStepDefinitions libraryStepDefinitions;
    private SignInPage signInPage;


    public Pages() {
        this.libraryStepDefinitions = new LibraryStepDefinitions();
        this.signInPage = new SignInPage();

    }

    public LibraryStepDefinitions libraryStepDefinitions() {
        return libraryStepDefinitions;
    }

    public SignInPage signInPage() {
        return signInPage;
    }
}





