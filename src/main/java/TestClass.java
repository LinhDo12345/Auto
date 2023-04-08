import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestClass {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup() {
        //set up data
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();

    }

    @Test
    public void Login() {
        chromeDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        WebElement Genderradio = chromeDriver.findElement(By.id("gender-female"));
        WebElement textFirstname = chromeDriver.findElement(By.id("FirstName"));
        WebElement textLastname = chromeDriver.findElement(By.id("LastName"));
        WebElement selectDay = chromeDriver.findElement(By.name("DateOfBirthDay"));
        WebElement selectMonth = chromeDriver.findElement(By.name("DateOfBirthMonth"));
        WebElement selectYear = chromeDriver.findElement(By.name("DateOfBirthYear"));
        WebElement textMail = chromeDriver.findElement(By.id("Email"));
        WebElement textCompanyName = chromeDriver.findElement(By.id("Company"));
        WebElement cbNewsletter = chromeDriver.findElement(By.id("Newsletter"));
        WebElement textPass = chromeDriver.findElement(By.id("Password"));
        WebElement textPassCf = chromeDriver.findElement(By.id("ConfirmPassword"));
        WebElement btnRegister = chromeDriver.findElement(By.id("register-button"));

        Select select1 = new Select(selectDay);
        Select select2 = new Select(selectMonth);
        Select select3 = new Select(selectYear);


        Actions actions = new Actions(chromeDriver);
        actions.click(Genderradio).build().perform();
        actions.sendKeys(textFirstname, "Do").build().perform();
        actions.sendKeys(textLastname, "Huyen Linh").build().perform();
        select1.selectByVisibleText("20");
        select2.selectByVisibleText("October");
        select3.selectByVisibleText("2000");
        actions.sendKeys(textMail, "huyenlinhdo20@gmail.com").build().perform();
        actions.sendKeys(textCompanyName, "ABC").build().perform();
        actions.click(cbNewsletter).build().perform();
        actions.sendKeys(textPass, "12345678").build().perform();
        actions.sendKeys(textPassCf, "12345678").build().perform();
        actions.click(btnRegister).build().perform();

//        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("0349996918");
//        chromeDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("linh123d");
//        chromeDriver.findElement(By.xpath("//button[@name='login']")).click();
    }

    @AfterMethod
    public void Cleanup() {
        System.out.println("After method");
        //chromeDriver.quit();
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }

    }

}
