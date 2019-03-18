package net.serenitybdd.examples.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.examples.model.Category;
import net.serenitybdd.examples.model.Subcategory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

/**
 * @author Vitalii Bondariev
 */

public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
        $("//sidebar-fat-menu").find(By.linkText(category.linkText())).click();
    }

    public void selectSubCategory(Category category, Subcategory subcategory) {
        withAction()
                .moveToElement($("//sidebar-fat-menu").find(By.linkText(category.linkText())))
                .perform();
        $("//a[contains(text(), '" + subcategory.linkText() + "')]").waitUntilVisible().click();
    }

    public void navigateP(Category category, Subcategory subcategory) {
        withAction()
                .moveToElement($("//sidebar-fat-menu").find(By.linkText(category.linkText())))
                .perform();
        $("//a[contains(text(), '" + subcategory.linkText() + "')]").waitUntilVisible().click();
    }
}
