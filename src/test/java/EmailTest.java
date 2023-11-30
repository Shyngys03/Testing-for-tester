import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class EmailTest extends BaseTest {
    @Test
    public void checkValidation(){

        open(BASE_PAGE);
        $(By.linkText("Sign in")).click();

        SelenideElement EmailField = $x("//input[@placeholder='Email']");
        SelenideElement PasswordField = $x("//input[@placeholder='Password']");

        EmailField.setValue(email);
        PasswordField.setValue(password);

        $("button").click();
    }
}