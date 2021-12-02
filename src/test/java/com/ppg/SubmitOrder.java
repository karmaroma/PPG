package com.ppg;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SubmitOrder {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }

    String ppgSku = "PPG SKU Test";
    String itemDescriprion = "Item Description Test";
    String customerprice = "777";
    String depotCost = "7";
    String color = "Black & White";
    String formula = "CmYK-200%";
    String quantity = "13";


    @Test
    void submitOrder() {
        open("https://devppgsupplyorderingportal.azurewebsites.net/customers/list");

        $x("/html/body/app-root/div/app-customer-list/div[3]/div/div[2]/mat-card/mat-card-footer/div/div[2]/mat-icon[1]").click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[1]/div[1]/div/div/mat-radio-group/mat-radio-button/label/span[2]").click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[1]/div[2]/button/span[1]").click();

        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div/input").click();
        $(byText("Facility-A")).click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[2]/div[1]/div[6]/mat-checkbox/label/span[2]").click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[2]/div[2]/button[2]").click();

        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[3]/div[1]/div[1]/button/span[1]").click();
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-color-item-add/mat-dialog-content/form/div/div[1]/mat-form-field/div/div[1]/div/input").setValue(ppgSku);
        $("[formcontrolname=description]").setValue(itemDescriprion);
        $("[formcontrolname=customerPrice]").setValue(customerprice);
        $("[formcontrolname=depotCost]").setValue(depotCost);
        $(byText("Next Gen")).click();
        $(byText("None")).click();
        $(byText("BASF")).click();
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-color-item-add/mat-dialog-content/form/div/div[6]/mat-form-field/div/div[1]/div/input").click();
        $(byText("Ben Moove")).click();
        $("[formcontrolname=color]").setValue(color);
        $("[formcontrolname=formula]").setValue(formula);
        $("[formcontrolname=quantity]").setValue(quantity);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-color-item-add/mat-dialog-actions/button[1]").click();
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[3]/div[2]/button[2]/span[1]").click();
        //submit
        $x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[4]/div[4]/button[3]/span[1]").click();
        //save
        //$x("/html/body/app-root/div/app-order-add/div/form/mat-horizontal-stepper/div[2]/div[4]/div[4]/button[2]/span[1]").click();





    sleep(4000);
    }
}
