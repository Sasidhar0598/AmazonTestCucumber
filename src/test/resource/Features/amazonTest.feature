#Author: sasidhar
#Feature: Login Feature
Feature: Test Amazon page I want to use this template for my feature file

  Background: 
    Given user should be on Amazon Homepage

  Scenario Outline: Testing of SignIn Page
    When user click on signin button
    Then user will be on Signin Page and Capture the title of the page
    And user entered email id as '<emailId>' on the page
    Then user clicked on Continue button
    # And I entered password as '<password>' on the page
    Then user click verify OTP
    And verify the title
    Then user close the browser

    Examples: 
      | emailId            | password |
      | sasidhar@gmail.com | sasi@123 |

  Scenario: Testing product search
    Given user should be on Amazon Homepage
    Then user start searching item
    Then now user click on searched item
    #And i add the item to wishlist for further booking
    Then user close the browser
