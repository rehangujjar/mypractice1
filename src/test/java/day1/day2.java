package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        // driver.navigate().to("http://amazon.com");
        //System.out.println("fresh");
        // driver.close();
    }
}
