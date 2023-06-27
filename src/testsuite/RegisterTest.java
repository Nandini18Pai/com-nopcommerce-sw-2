package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        // Verify the text ‘Register’
        String expectedDisplay = "Register";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display", expectedDisplay, actualDisplay);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        // Select gender radio button
        driver.findElement(By.id("gender-female")).click();

        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Champa");
        // Enter Last name
        driver.findElement((By.id("LastName"))).sendKeys("Chameli");
        // Select Day Month and Year

        driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']//option[@value='10']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']//option[@value='8']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']//option[@value='1999']")).click();
        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("wednesday@gmail.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("monday");
        // Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("monday");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        // Verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']")).getText();
        Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);


    }


    @After
    public void TearDown() {
        closeBrowser();
    }


}
