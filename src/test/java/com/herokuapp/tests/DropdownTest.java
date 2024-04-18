package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdownPage();

    }
    @Test
    public void dropDownTest(){
        new DropdownPage(driver)
                .selectOption()
                .isOptionSelected();
    }
}
