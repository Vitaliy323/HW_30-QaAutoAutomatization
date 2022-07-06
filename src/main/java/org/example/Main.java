package org.example;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import org.example.GaragePage;
import org.example.HomePage;

public class Main {

    @Test
    public void canLogin() {
        //Arrange
        HomePage homePage = new HomePage();

        //Act
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");


    }

    @Test
    public void canlogOutSide() {
        HomePage homePage = new HomePage();

        GaragePage garagePage = homePage.GarageSideOut("fortestqa@ukr.net", "Qwerty7777");
    }

    @Test
    public void canlogOutHeader() {
        HomePage homePage = new HomePage();

        GaragePage garagePage = homePage.GarageHeaderOut("fortestqa@ukr.net", "Qwerty7777");
    }


    @Test
    public void canAddCar() {

        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("fortestqa@ukr.net", "Qwerty7777");


        garagePage.addCar("Ford", "Focus",3.5)
                  .addCar("Audi", "TT",5.4)
                  .addCar("Fiat", "Ducato",3.5);



    }
}
