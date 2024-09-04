package org.stepdefinition;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BrowserLiftClass extends BaseLiftClass{

	PojoLiftClass p;
	@Given("User enter into chrome browser and open the Nibavlift url")
	public void user_enter_into_chrome_browser_and_open_the_Nibavlift_url() {
	  chromeBrowser();
	  maxWindow();
	  fetchUrl("https://www.nibavlifts.com/");
	}

	@When("User mouse hover the product")
	public void user_mouse_hover_the_product() {
		p = new PojoLiftClass();
		  Actions actions = new Actions(driver);
		  p.moveToProduct(actions);
	}

	@When("User click the series III max option")
	public void user_click_the_series_III_max_option() {
	   buttonClick(p.getBtnClick());
	}

}
