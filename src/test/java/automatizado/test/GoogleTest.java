package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String BASE_URL = "https://www.google.com/";
    private final String DRIVER_PATH = "src/test/java/automatizado/resource/chromedriver.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void devePesquisarNoGoogle(){
        iniciar();
    }
}
