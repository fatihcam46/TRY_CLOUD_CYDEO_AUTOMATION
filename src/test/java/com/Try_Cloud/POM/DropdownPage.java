package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {

    public void DropdownsPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="threePointItem")
    public WebElement threePointItemDropdown;


    @FindBy(id="profilePictureIcon")
    public WebElement profilePictureIconDropdown;




}
