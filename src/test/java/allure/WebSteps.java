package allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Open the Main page Github")
    public void openMainPage(){
        open("https://github.com/");
    }

    @Step("Find the Repository {repository}")
    public void searchForRepository(String repository){
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Go to the Repository {repository}")
    public void openRepositoryPage(String repository){
        $(By.linkText(repository)).click();
    }

    @Step("Open the Issue tab")
    public void openIssuesTab() {
        $(By.partialLinkText("Issues")).click();
    }

    @Step("Check existence of Issue # {number}")
    public void shouldSeeIssueWithNumber(int number) {
        $(withText("#" + number)).should(Condition.visible);
    }
}
