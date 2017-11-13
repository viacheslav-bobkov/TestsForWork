package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class ActionCameraPage {
    private static By ACTION_CAMERA_PAGE_ITEMS = By.id("schema-products");
    private static By ACTION_CAMERA_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By ACTION_CAMERA_PAGE_FILTERS = By.id("schema-filter");
    private static By ACTION_CAMERA_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");


    public static boolean ActionCameraPageIsOpened (WebDriver driver) {
        return driver.findElement(ACTION_CAMERA_PAGE_TITLE).getText().contains("Экшен-камеры");
    }

    public static void CheckActionCameraProducts (WebDriver driver) {
        driver.findElement(ACTION_CAMERA_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(ACTION_CAMERA_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(ACTION_CAMERA_PAGE_ANY_FILTER).isDisplayed();
    }

}
