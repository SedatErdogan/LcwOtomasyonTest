import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

public class lcwSenaryo {
    protected WebDriver driver;
    public static String loginUrl = "https://www.lcwaikiki.com/tr-TR/TR";
    public static String controlUrl = "https://www.lcwaikiki.com/tr-TR/TR";

    @Before
    public void setUp() {

        try {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdter\\IdeaProjects\\SeleniumTest\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void lcw() {

        try {

            driver.get(loginUrl);
            assertEquals(loginUrl, controlUrl);

            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div[1]/div/div[1]")).click();
            sleep(3000);

            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[1]/div/ul/li[3]/button")).click();
            sleep(3000);

            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/button")).click();
            sleep(3000);

            driver.findElement(By.xpath("/html/body/div[1]/div/button[2]")).click();
            sleep(3000);

            driver.findElement(By.id("close-button-1454703513202")).click();
            sleep(2000);

            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/div/div[3]/div[1]")).click();
            sleep(2000);

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/div/div[2]/div[1]/a/div[1]/img")).click();
            sleep(2000);

            driver.findElement(By.xpath("(//div[@id = 'option-size']/a)[1]")).click();
            sleep(2000);

            driver.findElement(By.id("pd_add_to_cart")).click();
            sleep(2000);

            driver.findElement(By.id("Path_3853")).click();
            sleep(2000);

            driver.findElement(By.className("main-header-logo")).click();
            sleep(2000);

            driver.quit();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void assertEquals(String loginUrl, String controlUrl) {
    }

    @After
    public void tearDown() throws Exception {

    }
}