package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {

    By CardHolderName= By.xpath("//input[@id='CardholderName']");

    By CardNumber= By.xpath("//input[@id='CardNumber']");

    By ExpireMonth = By.xpath("//select[@id='ExpireMonth']");

    By ExpireYear = By.xpath("//select[@id='ExpireYear']");

    By CardCode = By.xpath("//input[@id='CardCode']");

    By ContinueCardDetail = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By CardVisaNumber = By.xpath("//input[@id='CardNumber']");

    public void EnterCardHolderName() throws InterruptedException {
        sendTextToElement(CardHolderName,"kettyxyz");
        Thread.sleep(1000);
    }
    public void EnterCardNumber(){
        sendTextToElement(CardNumber,"5123 4590 4605 8920");
    }
    public void EnterExpireMonth(){
        sendTextToElement(ExpireMonth,"07");
    }
    public void EnterExpireYear()
    {
        sendTextToElement(ExpireYear,"2023");
    }
    public void EnterCardCode()
    {
        sendTextToElement(CardCode,"213");
    }
    public void ContinueCardDetails()
    {
        clickOnElement(ContinueCardDetail);
    }
    public void SelectVisaCardNumber()
    {
        sendTextToElement(CardVisaNumber,"5123 4590 4605 8920");
    }
 

}
