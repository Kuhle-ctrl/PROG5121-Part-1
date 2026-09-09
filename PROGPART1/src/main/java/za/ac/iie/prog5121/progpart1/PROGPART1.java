/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog5121.progpart1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class PROGPART1 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       Login userLogin = new Login();
       
       System.out.println("=== REGISTER===");
       System.out.print("Enter First Name: ");
       String firstName = input.nextLine();
       
       System.out.print("Enter Last Name: ");
       String lastName = input.nextLine();
       
       Login login = new Login();
       
       System.out.print("Enter Username: ");
       String username = input.nextLine();
       
       System.out.print("Enter Password: ");
       String password = input.nextLine();
       
       System.out.print("Enter Cellphone Number: ");
       String cellPhone = input.nextLine();
       
       //Call registerUser and display result
       String registrationResponse = login.registerUser(username, password, cellPhone, firstName, lastName);
       System.out.println("\n" + registrationResponse + "\n");
       
       //If registration fails, stop application
       if (!registrationResponse.contains("successfully")){
           System.out.println("Registration failed due to formatting errors.");
           input.close();
           return;
       }
       // ---LOGIN PHASE ---
       System.out.println("=== LOGIN ===");
       
       System.out.print("Enter Username: ");
       String loginUser = input.nextLine();
       
       System.out.print("Enter Password: ");
       String loginPass = input.nextLine();
       
       // Call loginUser and returnLoginStatus
       boolean loginSuccess = login.loginUser(loginUser, loginPass);
       String loginResponse = login.returnLoginStatus(loginSuccess);

       System.out.println("\n" + loginResponse);
       
       input.close();
   }
}
