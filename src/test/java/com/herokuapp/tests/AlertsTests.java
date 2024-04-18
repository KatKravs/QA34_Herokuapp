package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JavaScriptAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();

    }

    @Test
    public void alertJS(){
        new JavaScriptAlertsPage(driver).alertJSIsPresent().verifyResult("You successfully clicked an alert");
    }
    @Test
    public void alertJSConfirm(){
        new JavaScriptAlertsPage(driver).alertJSConfirmIsPresent("OK").verifyResult("You clicked: Ok");
    }

    @Test
    public void alertJSPromt(){
        new JavaScriptAlertsPage(driver).sendMessageToAlert("Hello world").verifyMessage("You entered: Hello world");

    }

}
