package org.stepdefinition;

import java.util.List;

import org.basec.BaseClass;
import org.pojo.SignInpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class FbRegistration extends BaseClass{
	
	SignInpojo s;
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To url of fb application")
	public void to_url_of_fb_application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		
	     s = new SignInpojo();
		
		clickBtn(s.getCreateNewAccount());
	    
	}

	@When("To pass first name in first name text box")
	public void to_pass_first_name_in_first_name_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		
		s = new SignInpojo();
		
		passText(l.get(2), s.getFirstnameTxtBox());
	}

	@When("To pass second name in second text box")
	public void to_pass_second_name_in_second_text_box() {
		s = new SignInpojo();
		
		passText("Ricky", s.getSecondnameTxtBox());
	   
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		List<String> l = d.asList();
	    s = new SignInpojo();
	    passText(l.get(3), s.getMobilenoTxtBox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
	    s = new SignInpojo();
	    passText("jeevan0124", s.getNewpassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   //closeEntireBrowser();
	}



}
