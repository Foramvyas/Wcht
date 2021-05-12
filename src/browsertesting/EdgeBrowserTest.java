package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.wcht.org.uk";
        WebDriver driver;
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();


    }


}
