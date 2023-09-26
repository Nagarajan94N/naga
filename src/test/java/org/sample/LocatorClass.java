package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorClass extends BaseClass {
	public LocatorClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="searchDropdownBox")
	private WebElement all;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement mobilesearch;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement btnclick;
	
	@FindBy(xpath = "//span[text()='₹10,000 - ₹20,000']")
	private WebElement price;
	
	@FindBy(xpath="//span[contains(text(),'Lava Blaze 5G (Glass Green, 6GB RAM, UFS 2.2 128GB Storage)')]")
	private WebElement LavaBlaze5G;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	@FindBy(id="attach-close_sideSheet-link")
	private WebElement closebtn;
	
	@FindBy(id="nav-cart")
	private WebElement cart1;

public WebElement getCart1() {
		return cart1;
	}

public WebElement getClosebtn() {
		return closebtn;
	}
	
	
	public WebElement getAll() {
		return all;
	}
	
	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getLavaBlaze5G() {
		return LavaBlaze5G;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	public WebElement getMobilesearch() {
		return mobilesearch;
	}
	public WebElement getPrice() {
		return price;
	}}
