//Main page appleinsider.ru

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
private final SelenideElement searchBoxInput = $x("//input[@name = 's']");

public MainPage(String url){
    open(url);
}

public SearchPage Search(String searchString){
    searchBoxInput.setValue(searchString).pressEnter();
    return new SearchPage();
}
//public void openWebSite(String url){
//    open(url);
//}
}
