import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.ShouldHave;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class ArticleTest extends BaseTest{

    @Test
    public void countArticles(){
        open(BASE_PAGE);
        sleep(5000);
        $$("app-article-preview").shouldHave(size(10));
    }
}
