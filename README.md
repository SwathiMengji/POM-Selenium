# Selenium - Page Object Model Framework

A Selenium (java) framework for automation testing based on Page Object Model (POM) using TestNG.

The framework uses:
Java
Selenium webdriver
TestNG

Website under test: https://tutorialsninja.com/demo/index.php?route=common/home
- The website is an e-commerce demo site designed by QAFox specifically for Selenium automation testing. 

Progress: 
2: Designing and documenting test cases for following Pages and fucntionalities
- Home Page
	- Search "Canon EOS 5D" and go back to home page.
	- Verify contents in dropdowns in homescreen ribbon by comapring data is excel file.
	- Verify images in carousel 1.
	- In "Featured" section for "iPhone" check for pop up text when hovering over cart, wishlist and compare icons.
	- Verify the "Dell" image in carousel 2.
	
- Register Page
	(Creating emails)
	- Verify error messages in each form entry by clicking "continue" button without entering any details.
	- Registering with already existing user email should throw error.
	- Different passwords in "Password" and "Password Confirm" entries should throw error.
	- Not checking the agreement checkbox and clicking on "continue" button should throw error.
	
	
- Login
	- Trying to login with incorrect details should throw error.




1: Basic structure and foundation
- Basic Folder structure
- Base.java, utils.java, pom.xnl and testng.xml
- Pages: contains object repo and methods
- Testpage: contains test case using TestNG annotations
