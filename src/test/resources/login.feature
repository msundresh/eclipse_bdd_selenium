#Feature: Demo Feature
#
#Scenario: Demonstrating how Cucumber-JVM works
#    Given I have a configured Cucumber-JVM project 
#    When I run it within my IDE 
#    Then I will be able to run connected step definitions
# Created by H305248 at 2/12/2019
Feature: login
  # login to the application to test python framewrok

  @GLSWW-1603
  Scenario: login
    Given I navigate to the URL
    When I login to the application with "qa.user@honidentitydev.onmicrosoft.com" and "Walk12345"
    Then the application should enter accounts page
    
  @GLSWW-1604
  Scenario: add customer
  	Given account has been logged in
  	When I create a Customer
  	Then I validate that the customer has been created