package org.example;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Checking {

    public void shouldHaveText(String text) {
        $(".alert").shouldHave(Condition.text(text));

    }
    public SelenideElement shouldvisibleIn(){
        SelenideElement selenide= $("#userNavDropdown").shouldHave(Condition.visible);
        return selenide;
    }
    public SelenideElement shouldvisibleOut(){
        SelenideElement selenide= $(".header_signin").shouldHave(Condition.visible);
        return selenide;
    }

}
