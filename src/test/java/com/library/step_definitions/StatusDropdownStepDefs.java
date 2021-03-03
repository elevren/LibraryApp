package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StatusDropdownStepDefs {

    @When("the librarian clicks an {string} in the drop-down menu called Status")
    public void the_librarian_clicks_on_in_the_drop_down_menu_called_Status(String string) {

        BrowserUtils.waitFor(3);

        WebElement dropdownElement = Driver.get().findElement(By.id("user_status"));
        Select userStatus = new Select(dropdownElement);

        userStatus.selectByVisibleText(string);

    }

    @Then("the column called Status in the table should show only {string}")
    public void the_column_called_Status_in_the_table_should_show_only(String string) {

        BrowserUtils.waitFor(3);

        Assert.assertEquals(string, new UsersPage().tableUserStatus(string));

    }
}
