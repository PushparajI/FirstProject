package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLiftClass extends BaseLiftClass {
	
	public PojoLiftClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu-item-16810")
	private WebElement proHover;

	public WebElement getProHover() {
		return proHover;
	}
	
	@FindBy(id="menu-item-16808")
	private WebElement btnClick;

	public WebElement getBtnClick() {
		return btnClick;
	}

	public void moveToProduct(Actions actions) {
		actions.moveToElement(proHover).perform();
		
	}

	
}
