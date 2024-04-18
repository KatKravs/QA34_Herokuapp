package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="column-a")
    WebElement Acontainer;
    @FindBy(id = "column-b")
    WebElement Bcontainer;
    public DragAndDropPage actionAtoB() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(Acontainer,Bcontainer).perform();
        String text = Bcontainer.getText();
        if(text.equals("B")){
            System.out.println("PASS!");
        }else {
            System.out.println("FAIL!");
        }


        return this;
    }
}
