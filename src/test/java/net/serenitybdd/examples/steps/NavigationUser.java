package net.serenitybdd.examples.steps;

import net.serenitybdd.examples.model.Category;
import net.serenitybdd.examples.model.Subcategory;
import net.serenitybdd.examples.ui.CategoryNavigationBar;
import net.serenitybdd.examples.ui.CurrentPage;
import net.serenitybdd.examples.ui.RozetkaHomePage;
import net.serenitybdd.examples.ui.SmartphonesPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author Vitalii Bondariev
 */

public class NavigationUser {

    RozetkaHomePage rozetkaHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;
    SmartphonesPage smartphonesPage;

    @Step
    public void isOnTheHomePage() {
        rozetkaHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }

    @Step
    public void navigatesToCategory(Category category, Subcategory subcategory) {
        categoryNavigationBar.selectSubCategory(category, subcategory);
    }

    @Step
    public void isOnTheSmartphonesPage() {
        smartphonesPage.open();
    }

    @Step
    public void shouldSeeTopSellingSmartphonesInCount(int i) {
        assertThat(smartphonesPage.countTopSellingSmartphones()).isEqualTo(i);
    }

    @Step
    public void goToNextPage() {
        smartphonesPage.navigateNextPage();
    }
}
