package junitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoTest {

    @Test
    public void sauceDemoTest() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input#user-name"));
        driver.findElement(By.xpath("//*[@id=\"password\"]"));
        driver.findElement(By.id("login-button"));
    }
}
