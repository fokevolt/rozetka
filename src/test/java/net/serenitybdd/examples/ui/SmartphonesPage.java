package net.serenitybdd.examples.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Vitalii Bondariev
 */
@DefaultUrl("https://rozetka.com.ua/mobile-phones/c80003/preset=smartfon/")
public class SmartphonesPage extends PageObject {
    public int countTopSellingSmartphones() {
        return findAll("//i[@class=\"g-tag-icon-small-popularity g-tag-i sprite\"]").size();
    }

    public void navigateNextPage() {
        withAction().moveToElement($("//li[contains(@id,'page') and contains(@class, 'active')]"))
                .moveByOffset(60, 0).click().perform();
    }
}
