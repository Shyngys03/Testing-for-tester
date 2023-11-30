import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class FavoriteArticleTest extends BaseTest {
    @Test
    public void CreateNewArticle(){
        open(BASE_PAGE);

        $(By.linkText("Sign in")).click();

        SelenideElement EmailField = $x("//input[@placeholder='Email']");
        SelenideElement PasswordField = $x("//input[@placeholder='Password']");

        EmailField.setValue(email);
        PasswordField.setValue(password);

        $("button").click();

        $(By.linkText("Global Feed")).click();

        $("h1").click();

        String articleTitle = $("h1").text();
        $("app-favorite-button").click();

        // This is my login
        $(By.linkText("Hunter17565")).click();
        $(By.linkText("FavoritedPosts")).click();

        $(By.className("app-article-preview")).should(exist);
    }
}