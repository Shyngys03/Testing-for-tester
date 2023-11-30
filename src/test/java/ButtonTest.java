import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ButtonTest extends BaseTest{
    @Test
    public void CheckButtonColor(){
        open(BASE_PAGE);
        sleep(5000);

        $(By.linkText("Sign in")).click();

        SelenideElement EmailField = $x("//input[@placeholder='Email']");
        SelenideElement PasswordField = $x("//input[@placeholder='Password']");

        EmailField.setValue(email);
        PasswordField.setValue(password);

        $("button").click();

        $(By.linkText("Settings")).click();

        $x("//button[@class = 'btn btn-outline-danger']")
                .hover()
                .shouldHave(Condition.cssValue("background-color", "rgba(184, 92, 92, 1)"));;

    }
}