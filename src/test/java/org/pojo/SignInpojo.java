package org.pojo;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpojo extends BaseClass{
	
	public SignInpojo() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//a[text()='Create New Account']")
		 private WebElement createNewAccount;
		
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement FirstnameTxtBox;
		
		@FindBy(name = "lastname")
		private WebElement SecondnameTxtBox;
		
		@FindBy(name = "reg_email__")
		private WebElement MobilenoTxtBox;
		
		@FindBy(name = "reg_passwd__")
		private WebElement Newpassword;

		public WebElement getCreateNewAccount() {
			return createNewAccount;
		}

		public WebElement getFirstnameTxtBox() {
			return FirstnameTxtBox;
		}

		public WebElement getSecondnameTxtBox() {
			return SecondnameTxtBox;
		}

		public WebElement getMobilenoTxtBox() {
			return MobilenoTxtBox;
		}

		public WebElement getNewpassword() {
			return Newpassword;
		}
		
		
		
		
		
 
	
	

}
