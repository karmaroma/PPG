package com.ppg;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.files.DownloadActions.click;

public class AddNewCustomer {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }
    String mail = "Myppg@test.com";

    String fillingLocation = "Facility-A";
    String customer = "4 Customer";
    String cpcCode = "008";
    String PPGNumber = "009";
    String THDNumber = "0020";
    String shippingAddress = "Avenue the5th, ,NEW Jersey, NJ, US, 23011";
    String shippingAddress2 = "Park Ave 15th, ,NEW York, NY, US, 11011";
    String name = "Harry the Potter";
    String addressLine1 = "66 BIGRaton st.";
    String addressLine2 = "77 SMALLBoca st.";
    String city = "Default";
    String emailAddress = "mailPPG@test.com";
    String contactName = "John Doe";
    String country = "United States";
    String contact = "John Doe";
    String state = "Florida";
    String zip = "32003";
    String phone ="850245500";
    String city2 = "Boston";
    String zip2 = "54666";
    String phone2 ="960545500";
    String city3 = "Chicago";
    String zip3 = "54666";
    String phone3 ="960545500";
    String shipName = "Billie Eilish";


    @Test
    void fillFormTest(){
     //Authorization
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

        $(byText("Customers")).click();
        sleep(100);
        $(byText("Add new customer")).click();
        sleep(100);

        //Create Customer with Name and Numbers
        $("[formcontrolname=name]").setValue(name);
        $("[formcontrolname=cpcCode]").setValue(cpcCode);
        $("[formcontrolname=ppgCustomerNumber]").setValue(PPGNumber);
        $("[formcontrolname=thdCustomerNumber]").setValue(THDNumber);

        //Add Billing Address
        $(byText("Add Billing Address")).click();
        $(".cdk-overlay-pane").$("[formcontrolname=name]").setValue(name);
        $("[formcontrolname=addressLine1]").setValue(addressLine1);
        $("[formcontrolname=addressLine2]").setValue(addressLine2);
        $("[aria-label=State]").click();
        $(byText("South Dakota")).click();
        $("[formcontrolname=city]").setValue(city);
        $("[formcontrolname=zip]").setValue(zip);
        $(byText("Add")).click();
        //sleep(1000);

        //Add New Contact
        $(byText("Add New Contact")).click();
        $(".cdk-overlay-pane").$("[formcontrolname=name]").setValue(contactName);
        $("[formcontrolname=emailAddress]").setValue(emailAddress);
        $("[formcontrolname=phoneNumber]").setValue(phone);
        $(byText("Add")).click();
        $(".card__more").click();
        $("[role=menuitem]").click();

        //Add New Shipping Address
        $(byText("Add New Shipping Address")).click();
        $(".cdk-overlay-pane").$("[formcontrolname=name]").setValue(shipName);
        $("[formcontrolname=addressLine1]").setValue(shippingAddress);
        $("[formcontrolname=addressLine2]").setValue(shippingAddress2);
        $("[aria-label=State]").click();
        $(byText("New York")).click();
        $("[formcontrolname=city]").setValue(city2);
        $("[formcontrolname=zip]").setValue(zip2);
        $(byText("Add")).click();
        $(byText("Create")).click();





        sleep(2000);







        //







        sleep(4000);

    }

    }


