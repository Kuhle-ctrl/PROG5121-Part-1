## Module
PROG5121 Programming 1A
## Project Overview
This Part 1 project implements the registration and login features for a console-based Java application using NetBeans, Maven, JUnit, and GitHub.
## Main Featurea
* **Username Validation:** Ensure username contains an underscore ('_') and does not exceed 5 characters.
* **Password Complexity Validation:** Ensure password is at least 8 characters long, containing a capital letter, a number, and a special character.
* **Cell Phone Validation:** Verifies international phone number formatting using a regex pattern.
* **User Registration & Login:** Stores user details and verifies credentials upon login attemps.
* **Unit Testing:** Comprehensive JUnit tests verifying both success and failure test paths.

## Project Structure
* 'Main.java' - Manages user input/output via the console.
* 'Login.java' - Contains registration logic, credential validation methods, and data handling.
* 'Login.java' - Contains JUnit tests located under 'src/test/java'.

 ## How to Run
1. Open the project in Apache NetBeans
2. Locate 'Main.java' in 'src/main/java'.
3. Right-click 'Main.java' and select **Test File**.
4. Follow the interactive console prompts.

## Testing 
1. Expand **Test Packages** -> 'src/test/java'.
2. Right-click 'LoginTest.java' and select **Test File**.
3. Confirm all JUnit test assertions pass.

## Reference
* **Cell Phone Regex Pattern Source:**
* Source: Regular Expressions Info / StackOverflow
* URL: https://www.regular-expression.info/
*  Pattern Used: '^\+\d{10,13}$'

