import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class CreateTest extends BaseTest {
    @Test
    public void CreateArticle(){
        open(BASE_PAGE);

        $(By.linkText("Sign in")).click();

        SelenideElement EmailField = $x("//input[@placeholder='Email']");
        SelenideElement PasswordField = $x("//input[@placeholder='Password']");

        EmailField.setValue(email);
        PasswordField.setValue(password);

        $("button").click();

        $(By.linkText("New Article")).click();

        String articleTitle = "My Testing for Testers";
        String articleText = "Hello everyone. Now I'm writing test to be junior tester.";

        SelenideElement titleField = $x("//input[@placeholder='Article Title']");
        SelenideElement textField = $x("//textarea[@placeholder='Write your article (in markdown)']");

        titleField.setValue(articleTitle);
        textField.setValue(articleText);

        $("button").click();
    }
}