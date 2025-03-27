package junitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class UrlTest {

    @Test
    public void informasiUrlTest(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

        String title = driver.getTitle();
        String currentURL = driver.getCurrentUrl();

        System.out.println("Title pada halaman web: " + title);
        System.out.println("URL saat ini pada halaman web: " + currentURL);
    }
}
