# Selenium - Page Object Model Framework

This project automates key functionalities of a website using **Selenium WebDriver**, **Java**, **TestNG**, and the **Page Object Model (POM)** framework. The goal is to validate various functionalities and elements on the site such as login, iframes, calendars, dropdowns, radio buttons, checkboxes, web tables, notifications, and alerts.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Test Cases Implemented](#test-cases-implemented)


## Project Overview

This automation project tests various modules of a website. The following functionality is covered:
- Login functionality
- Handling iframes for employee details
- Using a calendar pop-up for leave requests
- Selecting dropdowns and radio buttons for job assignments
- Interacting with checkboxes and web tables for employee selection
- Handling notifications and alerts

## Technologies Used

- **Java**: Programming language
- **Selenium WebDriver**: For browser automation
- **TestNG**: Testing framework for structuring tests
- **Page Object Model (POM)**: Design pattern for better maintainability and readability
- **Build**: Maven


## Test Cases Implemented

- Test Case 1: Verify Login Functionality
Test Scenario: Validate the login functionality of the OrangeHRM website.
Steps:
1.	Navigate to the login page.
2.	Enter valid credentials (username and password).
3.	Click on the "Login" button.
4.	Verify the heading “Dashboard” on the homepage.
Expected Result: User should be logged in successfully and redirected to the dashboard.


- Test Case 2: Verify Calendar Functionality for Leave Request
Test Scenario: Test the functionality of the calendar while applying for leave.
Steps:
1.	Navigate to the "Leave" section after logging in.
2.	Click on "Apply" for a leave request.
3.	In the date fields, select the "From" and "To" dates using the calendar pop-up.
Expected Result: The user should be able to select dates from the calendar, and the correct dates should be populated in the input fields.

**More test cases with different functionalities on the way..."