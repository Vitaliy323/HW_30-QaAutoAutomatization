package org.example;

import org.testng.annotations.Test;
import org.example.GaragePage;
import org.example.HomePage;

public class PageObjectTest {
    public PageObjectTest() {
    }

    @Test
    public void canLogin() {
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");
        garagePage.checking.shouldHaveText("You have been successfully logged in");
        garagePage.checking.shouldvisibleIn();
    }
    @Test
    public void canlogOutSide() {
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");
        garagePage.checking.shouldvisibleOut();
    }
    @Test
    public void canlogOutHeader() {
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");
        garagePage.checking.shouldvisibleOut();
    }
    @Test
    public void canAddCar() {
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");
        garagePage.addCar("Ford", "Focus", 3.5)
                  .addCar("Audi", "TT", 5.4)
                  .addCar("Fiat", "Ducato", 3.5);
        garagePage.checking.shouldHaveText("Car added");
    }
}
