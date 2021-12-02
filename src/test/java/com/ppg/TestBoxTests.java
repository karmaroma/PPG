package com.ppg;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class TestBoxTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }
    String mail = "Myppg@test.com";

    String fillingLocation = "Facility-A";
    String customer = "Rich Customer";
    String customerNumber = "007";
    String billingAddress = "Avenue the5th, ,NEW YORK, NY, US, 10011";
    String name = "John Joe";
    String addressLine1 = "66 Raton st.";
    String addressLine2 = "77 Boca st.";
    String city = "Boca Raton";
    String country = "United States";
    String contact = "John Joe";
    String state = "Florida";
    String zip = "32003";
    String phone ="850245500";
    String city2 = "Boston";
    String zip2 = "54666";
    String phone2 ="960545500";
    String city3 = "Chicago";
    String zip3 = "54666";
    String phone3 ="960545500";


    @Test
    void fillFormTest(){
        open("https://devppgsupplyorderingportal.azurewebsites.net/");

        $(byText("Customers")).click();
        $x("/html/body/app-root/div/app-customer-list/div[2]/button").click();
        //Create Customer
        // $(".mat-button-wrapper").click();
        //  $x("/html/body/app-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-list-item[3]/div/a/span").click();
        //  $x("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-customer-list/div[2]/button/span[1]/mat-icon").click();
        $x("/html/body/app-root/div/app-customer-add/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input").setValue(name);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div/input").setValue(mail);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[3]/div[3]/mat-form-field/div/div[1]/div/input").setValue(city);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div/input").setValue(addressLine1);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input").setValue(phone);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[2]/div[2]/mat-form-field/div/div[1]/div/input").setValue(customerNumber);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div/input").setValue(addressLine2);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[3]/div[6]/mat-form-field/div/div[1]/div/input").setValue(zip);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[3]/div[4]/mat-form-field/div/div[1]/div/app-state-form-control/div/input").click();
        // $x("/html/body/div[2]/div/div/div/mat-option[10]/span").click();
        $(byText("Florida")).click();
        $x("/html/body/app-root/div/app-customer-add/div/form/div[4]/div[1]/mat-form-field/div/div[1]/div/input").setValue(name);
        $x("/html/body/app-root/div/app-customer-add/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div/textarea").setValue(billingAddress);

        $x("/html/body/app-root/div/app-customer-add/div/form/div[5]/div[2]/button/span[1]").click();
        //$("[formcontrolname=name]").setValue(name);
        //$("[formcontrolname=addressLine1]").setValue(addressLine1);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[1]/mat-form-field/div/div[1]/div/input").setValue(name);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[2]/mat-form-field/div/div[1]/div/input").setValue(mail);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[3]/mat-form-field/div/div[1]/div/input").setValue(addressLine1);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[4]/mat-form-field/div/div[1]/div/input").setValue(addressLine2);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[5]/mat-form-field/div/div[1]/div/input").setValue(city2);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[6]/mat-form-field/div/div[1]/div/app-state-form-control/div/input").click();
        $(byText("Massachusetts")).click();
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[8]/mat-form-field/div/div[1]/div/input").setValue(zip2);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-content/form/div/div[9]/mat-form-field/div/div[1]/div/input").setValue(phone2);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-contact-add/mat-dialog-actions/button[1]/span[1]").click();


        $x("/html/body/app-root/div/app-customer-add/div/form/div[6]/div[2]/button").click();
         $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[1]/mat-form-field/div/div[1]/div/input").setValue(customer);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[2]/mat-form-field/div/div[1]/div/input").setValue(addressLine1);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[3]/mat-form-field/div/div[1]/div/input").setValue(addressLine2);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[4]/mat-form-field/div/div[1]/div/input").setValue(city3);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[5]/mat-form-field/div/div[1]/div/app-state-form-control/div/input").click();
        $(byText("Illinois")).click();
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[7]/mat-form-field/div/div[1]/div/input").setValue(zip3);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[8]/mat-form-field/div/div[1]/div/input").click();
        $(byText("John Joe")).click();
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-content/form/div/div[9]/mat-form-field/div/div[1]/div/input").setValue(phone3);
        $x("/html/body/div[2]/div[2]/div/mat-dialog-container/app-shipping-address-add/mat-dialog-actions/button[1]/span[1]").click();

        $x("/html/body/app-root/div/app-customer-add/div/form/div[7]/button[1]/span[1]").click();


        sleep(4000);

    }

    }


