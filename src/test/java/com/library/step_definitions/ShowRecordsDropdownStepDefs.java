package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShowRecordsDropdownStepDefs {

    @When("the librarian clicks on {string} in the drop-down menu called Show Records")
    public void the_librarian_clicks_on_in_the_drop_down_menu_called_Show_Records(String string) {

        BrowserUtils.waitFor(3);

        WebElement dropdownElement = Driver.get().findElement(By.name("tbl_users_length"));
        Select showRecords = new Select(dropdownElement);

        showRecords.selectByVisibleText(string);


    }

    @Then("the number of rows in the table should be {string}")
    public void the_number_of_rows_in_the_table_should_be(String string) {

        BrowserUtils.waitFor(3);

        Assert.assertEquals(string, new UsersPage().getTableRowNumber());



    }


}
