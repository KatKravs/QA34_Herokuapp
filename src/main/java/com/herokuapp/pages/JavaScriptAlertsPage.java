package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaScriptAlertsPage extends BasePage{
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css = "[onclick='jsAlert()']")
    WebElement jsAlertButton;
    public JavaScriptAlertsPage alertJSIsPresent() {
        click(jsAlertButton);
            driver.switchTo().alert().accept();


//        Assert.assertTrue(isAlertPresent());


        return this;
    }


    @FindBy(id = "result")
    WebElement result;
    public JavaScriptAlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement jsConfirmAlertButton;
    public JavaScriptAlertsPage alertJSConfirmIsPresent(String confirm) {
        click(jsConfirmAlertButton);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
    @FindBy(css = "[onclick='jsPrompt()']")
    WebElement jspromtButton;
    public JavaScriptAlertsPage sendMessageToAlert(String message) {
        click(jspromtButton);
        if(message!=null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
    @FindBy(id="result")
    WebElement promtResult;
    public JavaScriptAlertsPage verifyMessage(String text) {
        Assert.assertTrue(promtResult.getText().contains(text));
        return this;
    }
}
