package Gokomodo.FE.Web.Buyer.utils;

import Gokomodo.FE.Web.Buyer.controllers.BuyerBaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class BuyerExplicitWaiting extends BuyerBaseMethod {

    /*Select using WebElements*/

    /**
     * To Wait Until Element to be Clickable
     */
    public static void explicitWaitElementToBeClickable(WebElement element, int milliSeconds) {
        WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        clickableWait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * To Wait Until Element to be Selectable
     */
    public static void explicitWaitElementToBeSelected(WebElement element, int milliSeconds) {
        WebDriverWait selectableWait = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        selectableWait.until(ExpectedConditions.elementToBeSelected(element));
    }


    /**
     * To Wait Until Element has the text
     */
    public static void explicitWaitTextToBePresentInElement(WebElement element, int milliSeconds, String text) {
        WebDriverWait textToBePresent = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        textToBePresent.until(ExpectedConditions.textToBePresentInElement(element, text));
    }


    /**
     * To Wait Until Title contains the text
     */
    public static void explicitWaitTitleContains(WebElement element, int milliSeconds, String title) {
        WebDriverWait titleContains = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        titleContains.until(ExpectedConditions.titleContains(title));
    }


    /**
     * To Wait Until Title is
     */
    public static void explicitWaitTitleIs(WebElement element, int milliSeconds, String title) {
        WebDriverWait titleIs = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        titleIs.until(ExpectedConditions.titleIs(title));
    }


    /**
     * To Wait Until Element to be Visible
     */
    public static void explicitWaitVisibilityOfElement(WebElement element, int milliSeconds) {
        WebDriverWait elementToBeVisible = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        elementToBeVisible.until(ExpectedConditions.visibilityOf(element));
    }


    /**
     * To Wait Until Element is Selected
     */
    public static void explicitWaitSelectionStateToBe(WebElement element, int milliSeconds, boolean selected) {
        WebDriverWait elementIsSelected = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        elementIsSelected.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }


    /**
     * To Wait Until Elements to be Visible
     */
    public static void explicitWaitVisibilityOfElements(List<WebElement> element, int milliSeconds) {
        WebDriverWait elementsToBeVisible = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        elementsToBeVisible.until(ExpectedConditions.visibilityOfAllElements(element));
    }


    /*Select using By Method*/

    /**
     * To Wait Until Element to be Clickable
     */
    public static void explicitWaitElementToBeClickable(By element, int milliSeconds) {
        WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        clickableWait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * To Wait Until Element to be Selectable
     */
    public static void explicitWaitElementToBeSelected(By element, int milliSeconds) {
        WebDriverWait selectableWait = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        selectableWait.until(ExpectedConditions.elementToBeSelected(element));
    }


    /**
     * To Wait Until Title contains the text
     */
    public static void explicitWaitTitleContains(By element, int milliSeconds, String title) {
        WebDriverWait titleContains = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        titleContains.until(ExpectedConditions.titleContains(title));
    }


    /**
     * To Wait Until Title is
     */
    public static void explicitWaitTitleIs(By element, int milliSeconds, String title) {
        WebDriverWait titleIs = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        titleIs.until(ExpectedConditions.titleIs(title));
    }


    /**
     * To Wait Until Element to be Visible
     */
    public static void explicitWaitVisibilityOfElement(By element, int milliSeconds) {
        WebDriverWait elementToBeVisible = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        elementToBeVisible.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    /**
     * To Wait Until Element is Selected
     */
    public static void explicitWaitSelectionStateToBe(By element, int milliSeconds, boolean selected) {
        WebDriverWait elementToBeVisible = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        elementToBeVisible.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }


    /**
     * To Wait for the Alert
     */
    public static void explicitWaitForAlert(int milliSeconds) {
        WebDriverWait waitForAlert = new WebDriverWait(getWebDriver(), Duration.ofMillis(milliSeconds));
        waitForAlert.until(ExpectedConditions.alertIsPresent());
    }
}