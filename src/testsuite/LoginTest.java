package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        @Before
        public void setUp() {
            openBrowser(baseUrl);
        }

            @Test
            public void userShouldLoginSuccessfullyWithValidCredentials() {
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            String expectedMessage = "Dashboard";
            WebElement actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
            String actualMessage1 = actualMessage.getText();
            Assert.assertEquals("Error Message is not Displayed ", actualMessage1, expectedMessage);


        }

        @After
        public void tearDown() {

            closeBrowser();

        }

    }
