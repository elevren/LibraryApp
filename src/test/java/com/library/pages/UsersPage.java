package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UsersPage {

    public UsersPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//table//tbody//tr")
    public List<WebElement> table;

    @FindBy(id = "tbl_users_info")
    public WebElement tableRow;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


    public void tableUserNames(String GroupName){

        List<WebElement> numRows = table;

        for (int i = 1; i <= numRows.size(); i++) {

            WebElement row = Driver.get().findElement(By.xpath("//table//tbody//tr["+i+"]//td[5]"));
            Assert.assertEquals(GroupName, row.getText());

        }

    }

    public String getTableRowNumber(){


        BrowserUtils.waitFor(4);

        String text = tableRow.getText();
        String[] dateInputarr = text.split(" ");

        System.out.println(dateInputarr[3]);

        BrowserUtils.waitFor(3);

        return dateInputarr[3];


    }

    public ArrayList<String> getUserInformation(){

        BrowserUtils.waitFor(3);

        ArrayList<String> a = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {

            WebElement row = Driver.get().findElement(By.xpath("//table//tbody//tr[1]//td["+i+"]"));
            a.add(row.getText());

        }

        return a;


    }

    public String tableUserStatus(String UserStatus){

        List<WebElement> numRows = table;

        for (int i = 1; i <= numRows.size(); i++) {

            WebElement row = Driver.get().findElement(By.xpath("//table//tbody//tr["+i+"]//td[6]"));

            return row.getText();

            /*Assert.assertEquals(UserStatus, row.getText());*/

        }

        return UserStatus;
    }



}
