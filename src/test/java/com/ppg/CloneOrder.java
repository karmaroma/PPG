package com.ppg;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class CloneOrder {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }

    @Test
    void cloneOrder(){
        open("https://devppgsupplyorderingportal.azurewebsites.net/");
        sleep(2000);
        $("[name=loginfmt]").setValue("rgolovin@ppg.com");
        $("[type=submit]").click();
        sleep(2000);
        $("[name=passwd]").setValue("2dMETtBnxmH8V3f");
        $("[type=submit]").click();
        sleep(2000);
        $(".table-cell.text-left.content").click();
        sleep(15000);
        $("[value=Verify]").click();
        sleep(1000);
        $("#idSIButton9").click();
        sleep(1000);
     //   open("https://devppgsupplyorderingportal.azurewebsites.net/customers/list");


        $("[data-placeholder=\"Customer or Order #\"]").setValue("34");
        $x("/html/body/app-root/div/app-order-card-list/div[2]/app-order-card/mat-card/mat-card-actions/div[2]/button/span[1]/mat-icon").click();
        $(byText("Clone")).click();
        $(byText("TuffShed")).click();
        $(byText("Next")).click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[2]/div[2]/button[2]").click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[3]/div[2]/button[2]").click();
        //$(byText("Next")).click();
        // $(By.linkText("Next")).click();
        $(byText("Save")).click();
        sleep(5000);

    }
}
