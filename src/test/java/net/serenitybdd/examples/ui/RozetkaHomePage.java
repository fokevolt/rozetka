package net.serenitybdd.examples.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

/**
 * @author Vitalii Bondariev
 */
@DefaultUrl("https://rozetka.com.ua")
public class RozetkaHomePage extends PageObject {
    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }
}
