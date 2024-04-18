package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public LinkList getJavaScriptAlerts() {
        click(javaScriptAlerts);
        return new LinkList(driver);
    }

    @FindBy(css = "[href='/windows']")
    WebElement windowsLink;

    public LinkList getWindowsPage() {
        click(windowsLink);
        return new LinkList(driver);
    }

    @FindBy(css = "[href='/checkboxes']")

    WebElement checkboxLink;

    public LinkList getCheckboxesPage() {
        click(checkboxLink);
        return new LinkList(driver);
    }
    @FindBy(css = "[href='/dropdown']")

    WebElement dropdownLink;
    public LinkList getDropdownPage() {
        click(dropdownLink);

        return new LinkList(driver);
    }
    @FindBy(css = "[href='/upload']")

    WebElement uploadLink;
    public LinkList getFileUploadPage() {
        click(uploadLink);
        return new LinkList(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImagesLink;
    public HomePage getBrokenImagesPage() {
        click(brokenImagesLink);
        return new HomePage(driver);
    }
    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDropLink;
    public HomePage getDragAndDropPage() {
        click(dragAndDropLink);
        return new HomePage(driver);
    }
}
