package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully
        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign
        In!’
        2. userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display
        3. verifyTheErrorMessage
        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/
public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedTest = "Welcome, Please Sign In!";
        String actualTest = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to login page", expectedTest, actualTest);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        // Verify the ‘Log out’ text is display
        String expectedDisplayLogOut = "Log out";
        String actualDisplayLogOut= driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("Log Out Not display",expectedDisplayLogOut,actualDisplayLogOut);

    }
    @Test
    public void verifyTheErrorMessageWithInvalidCredential() {

        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter Invalid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //  Enter Invalid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        // Verify the error message
        String expectedTest = "Login was unsuccessful. Please correct the errors and try again.\n" +
                              "No customer account found";
        String actualTest = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedTest, actualTest);

    }

    @After
    public void teraDown() {
         closeBrowser();
    }



}
