/**
 * 
 */
package com.cucumber.project.amazontest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * sasidhar
 */
public class AmazonTestStep {
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
	}
	@After
	public void cleanUp() {
		driver.quit();
	}
	
	
	@Given("user should be on Amazon Homepage")
	public void user_should_be_on_amazon_homepage() {
		//driver = new ChromeDriver();
		System.out.println("-------");
		
		
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Then("user will be on Signin Page and Capture the title of the page")
	public void user_will_be_on_signin_page_and_capture_the_title_of_the_page() {
		System.out.println("title of the is page is : "+ driver.getTitle());
	}

	@Then("user entered email id as {string} on the page")
	public void user_entered_email_id_as_on_the_page(String emailId) throws InterruptedException {
		driver.findElement(By.id("ap_email")).sendKeys(emailId);
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
	}

	@Then("user clicked on Continue button")
	public void user_clicked_on_continue_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
	}

//	@Then("user entered password as {string} on the page")
//	public void user_entered_password_as_on_the_page(String password) throws InterruptedException {
//		driver.findElement(By.id("ap_password")).sendKeys(password);
//		Thread.sleep(7000);// Write code here that turns the phrase above into concrete actions
//	    
//	}

	@Then("user click verify OTP")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		String expectedTitle = "Authentication required";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Then("verify the title")
	public void verify_the_title() throws InterruptedException {
		
		String expectedTitle = "Authentication required";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		assertEquals(expectedTitle, actualTitle);
	}

	@Then("user start searching item")
	public void user_start_searching_item() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Shirts");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		Thread.sleep(2000);
	}

	@Then("now user click on searched item")
	public void now_user_click_on_searched_item() throws InterruptedException {
		driver.findElement(By.linkText("U.S. POLO ASSN.")).click();
		Thread.sleep(2000);
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		//driver.close();
		System.out.println("driver closed");
	}

}
