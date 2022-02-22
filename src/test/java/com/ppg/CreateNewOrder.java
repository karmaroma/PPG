package com.ppg;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CreateNewOrder {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }

    @Test
    void createNewOrder(){
        open("https://app-thdportal-stg-01.azurewebsites.net/orders/list");

        sleep(2000);
        $("[name=loginfmt]").setValue("rgolovin@ppg.com");
        $("[type=submit]").click();
        sleep(2000);
        $("[name=passwd]").setValue("71305@Asdf");
        $("[type=submit]").click();
        sleep(2000);
        //$(".table-cell.text-left.content").click();
        $("[data-value=PhoneAppNotification]").click();
        //$("[data-value=OneWaySMS]").click();
        //sleep(5000);
        //$("[value=Verify]").click();
        sleep(10000);
        $("#idSIButton9").click();
        sleep(1000);


        $(byText("Create order")).click();
    }
}
