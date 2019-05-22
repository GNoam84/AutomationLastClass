import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void set(){
        System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ynet.co.il");
    }

    @Test
    public void testing(){
        System.out.println("Hi guys!");
    }

    @AfterClass
    public static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
