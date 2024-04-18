package com.herokuapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="dropdown" )
    WebElement optionContainer;
    @FindBy(css="#dropdown > option:nth-child(2)" )
    WebElement option1;
    @FindBy(css="#dropdown > option:nth-child(3)" )
    WebElement option2;

    public DropdownPage selectOption() {
        click(optionContainer);

          optionContainer.sendKeys(Keys.ARROW_DOWN);
          optionContainer.sendKeys(Keys.ENTER);

        return this;
    }

    public void isOptionSelected() {
        Assert.assertTrue(option1.isSelected(), "Option 2 is not selected");
    }
}
