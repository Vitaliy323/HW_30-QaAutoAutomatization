package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    SelenideElement signInButton = $(".header_signin");
    SelenideElement emailInput = $("#signinEmail");
    SelenideElement passwordInput =  $("#signinPassword");
    SelenideElement loginButton =  $x("//*[text()='Login']");
    SelenideElement headerMenu = Selenide.$("#userNavDropdown");
    SelenideElement logoutHeader = Selenide.$x("//*[text()='Logout']");
    SelenideElement sideMenuOut = Selenide.$(".icon-logout");
    public HomePage(){
        open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto"
        );
    }

    public GaragePage login(String email, String password) {
        signInButton.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new GaragePage();
    }

    public GaragePage GarageSideOut (String email, String password){
        signInButton.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        sideMenuOut.click();

        return null;
    }
    public GaragePage GarageHeaderOut (String email, String password){
        signInButton.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        headerMenu.click();
        logoutHeader.click();

        return null;
    }
}
