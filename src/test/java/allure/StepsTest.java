package allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int NUMBER = 68;
    @Test
    public void lambdaStepTests() {

        step("Open the Main page Github", () -> {
            open("https://github.com/");
        });
        step("Find the Repository " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Go to the Repository " + REPOSITORY, () -> {
            $(By.linkText(REPOSITORY)).click();
        });
        step("Open the Issue tab", () -> {
            $(By.partialLinkText("Issues")).click();
        });
        step("Check existence of Issue #" +NUMBER, () -> {
            $(withText("#" + NUMBER)).should(Condition.visible);
        });

    }
/*
    @Test
    public void annotatedStepsTest() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchForRepository();
        steps.openRepositoryPage(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber(NUMBER);

    }

 */
}