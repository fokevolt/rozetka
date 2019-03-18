package net.serenitybdd.examples.features.navigation;

import net.serenitybdd.examples.model.Category;
import net.serenitybdd.examples.model.Subcategory;
import net.serenitybdd.examples.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * @author Vitalii Bondariev
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigationUser user;

    @Managed
    WebDriver driver;

    @Test
    public void shouldBeAbleToNavigateToTheElectronicsCategory() {
        // Given
        user.isOnTheHomePage();

        // When
        user.navigatesToCategory(Category.Electronics, Subcategory.Smartphones);

        // Then
        user.shouldSeePageTitleContaining("Смартфоны");
    }

    @Test
    public void shouldSeeThreeTopSellingSmartphonesOnFirstThreePages() {
        // Given
        user.isOnTheHomePage();

        // When
        user.navigatesToCategory(Category.Electronics, Subcategory.Smartphones);

        //Then
        user.shouldSeeTopSellingSmartphonesInCount(3);

        // When
        user.goToNextPage();

        // Then
        user.shouldSeeTopSellingSmartphonesInCount(3);

        // When
        user.goToNextPage();

        // Then
        user.shouldSeeTopSellingSmartphonesInCount(3);
    }
}