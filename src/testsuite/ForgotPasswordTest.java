package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends LoginTest {


    String baseUrl= "https://opensource-demo.orangehrmlive.com/";
        @Test
        public void userShouldNavigateToForgotPasswordPageSuccessfully() {
            driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
            String expectedMessage = "Reset Password";
            WebElement actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
            String actualMessage1 = actualMessage.getText();
            Assert.assertEquals("Error Message", expectedMessage, actualMessage1);
        }

        }
