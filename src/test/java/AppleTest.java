import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleTest {
    private final static String Base_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 11";


    @Test
    public void checkHref() {

        assertTrue(new MainPage(Base_URL)
                .Search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains("iphone-13"));

//        open("https://www.google.com/");
//        $x("//textarea[@name='q']").setValue("Selenium").pressEnter();
//        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }
}
