import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.After;

abstract public class BaseTest {
    public final static String BASE_PAGE = "https://angular.realworld.io/";
    public final static String email = "vip.sh3541@gmail.com";
    public final static String password = "sh20030213";


    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    @Before
    public void init(){
        setUp();
    }

    @After
    public void close(){
        Selenide.closeWebDriver();
    }
}
