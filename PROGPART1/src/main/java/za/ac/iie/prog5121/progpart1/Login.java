/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog5121.progpart1;
import java.util.regex.Pattern;
/**
 *
 * @author Student
 */
public class Login {
    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;
    
    // Checks username contain '_' and is <= 5 chars
    public boolean checkUserName(String username){
        return username.contains("_")&& username. length()<=5;
    }
    // Checks password complexity
    public boolean checkPasswordComplexity(String password){
        if (password.length() < 8){
            return false;
        }
    
    
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
    
        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c))hasUpper = true;
            else if (Character.isDigit(c))hasDigit = true;
            else if (!Character.isLetterOrDigit(c))hasSpecial = true;
        }
       
        return hasUpper && hasDigit && hasSpecial;
    }
    /*
    * Regex pattern adapted from:
    * Author/Website: StackOverflow
    * URL: https://stackoverflow.com
    * Date: September 2026
    * Description: Checks for valid international format (+27 followed by 9 digits)
    */
    public boolean checkCellPhoneNumber(String cellNumber) {
            if (cellNumber == null){
                return false;
            }
            String regex = "^\\+\\d{10,12}$";
            return  Pattern.matches(regex, cellNumber);
    }
    // Handles user registration logic and return brief messages
    public String registerUser(String username, String password, String cellNumber, String firstName, String lastName){
         if (!checkUserName(username)){
             return "The username is incorrectly formatted, please ensure that your username contain an underscore and is no more than 5  characters in lengh.";
         }
         if (!checkPasswordComplexity(password)){
             return "The cell phone number is incorrectly formatted.";
         }
         if (!checkCellPhoneNumber(cellNumber)){
             return "The cell phone number is incorrectly formatted.";
         }
         this.username = username;
         this.password = password;
         this.cellNumber = cellNumber;
         this.firstName = firstName;
         this.lastName = lastName;
         
         return "The two conditions have been met and the user has been registered successfully.";

    }
    //Checks if login inputs match stored registration data
   public boolean loginUser(String enteredUsername, String enteredPassword){
       return enteredUsername.equals(this.username)&& enteredPassword.equals(this.password);
   }
   
   // Return final login message based on login success
   public String returnLoginStatus(boolean isLoggedIn){
       if (isLoggedIn){
           return "Welcome " + firstName + " " + lastName + "it is great to see you again.";
       } else {
           return "Username or password incorrect, please try again.";
       }    
   }  
   
}


 