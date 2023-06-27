package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //   click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
        //    Verify the text ‘Computers’
        String expectedDisplayComputers = "Computers";
        String actualDisplayComputers= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Computers",expectedDisplayComputers,actualDisplayComputers);
        }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
        //    Verify the text ‘Electronics’
        String expectedDisplayElectronics = "Electronics";
        String actualDisplayElectronics= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Electronics",expectedDisplayElectronics,actualDisplayElectronics);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        //    Verify the text ‘Apparel’
        String expectedDisplayApparel = "Apparel";
        String actualDisplayApparel= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Apparel",expectedDisplayApparel,actualDisplayApparel);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        //    Verify the text ‘Digital downloads’
        String expectedDisplay = "Digital downloads";
        String actualDisplay= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Digital downloads",expectedDisplay,actualDisplay);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[text()='Books ']")).click();
        //    Verify the text ‘Books ’
        String expectedDisplay = "Books";
        String actualDisplay= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Books",expectedDisplay,actualDisplay);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        //    Verify the text ‘Jewelry ’
        String expectedDisplay = "Jewelry";
        String actualDisplay= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Jewelry",expectedDisplay,actualDisplay);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("monday@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("monday");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //   click on the ‘Gift Cards ’ Tab
      driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        //    Verify the text ‘Gift Cards  ’
        String expectedDisplay = "Gift Cards";
        String actualDisplay= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Gift Cards ",expectedDisplay,actualDisplay);
    }




    @After
    public void TearDown() {
        closeBrowser();
    }


}
