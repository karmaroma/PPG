package com.ppg;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.files.DownloadActions.click;

public class AddNewCustomer {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1900x1080";
    }

    Faker faker = new Faker();
    Faker usFaker = new Faker(new Locale("en-US"));

    String name = faker.funnyName().name();
    String firstName = faker.name().firstName(); // Emory
    String lastName = faker.name().lastName(); // Barton
    String cpcCode = faker.number().digits(5);
    String PPGNumber = faker.number().digits(5);
    String THDNumber = faker.number().digits(3);
    String addressLine1 = faker.address().streetAddress();
    String addressLine2 = faker.address().secondaryAddress();
    String city = faker.address().city();
    String zip = faker.address().zipCodeByState(faker.address().stateAbbr());
    String contactName = faker.name().fullName();
    String emailAddress = faker.internet().emailAddress();
    String phone = faker.phoneNumber().cellPhone();
    String shipName = faker.twinPeaks().character();
    String shippingAddress = faker.address().streetAddress();
    String shippingAddress2 = faker.address().secondaryAddress();
    String city2 = faker.address().cityName();
    String zip2 = faker.address().zipCodeByState(faker.address().stateAbbr());
    String state = faker.address().state();
    String state2 = faker.address().state();

   /* String mail = "Myppg@test.com";v
    String fillingLocation = "Facility-A";
    String customer = "4 Customer";
    String cpcCode = "01228";
    String PPGNumber = "31234";
    String THDNumber = "6766";
    String shippingAddress = "Elm street 13 666 ";
    String shippingAddress2 = "Elm Streeet 222";
    String name = "Customer_19_01_02";
    String addressLine1 = "88 WErnt st.";
    String addressLine2 = "99 Gripp st.";
    String city = "New Jersey";
    String emailAddress = "FreddyKr@test.com";
    String contactName = "Ann ";
    String country = "United States";
    String contact = "John Doe";
    String state = "Florida";
    String zip = "32003";
    String phone ="850245500";
    String city2 = "Null";
    String zip2 = "54666";
    String phone2 ="960545500";
    String city3 = "Chicago";
    String zip3 = "54666";
    String phone3 ="960545500";
    String shipName = "Henry McHenry";*/



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
        $(byText(state)).click();
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
        $(byText(state2)).click();
        $("[formcontrolname=city]").setValue(city2);
        $("[formcontrolname=zip]").setValue(zip2);
        $(byText("Add")).click();
        $(byText("Create")).click();


        sleep(2000);

        sleep(4000);

    }

    }


