/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog5121.progpart1;

/**
 *
 * @author Student
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    @Test 
    public void testUsernameVaild(){
        Login login = new Login();
        assertTrue(login.checkUserName("kyl_1"));
    }
    @Test
    public void testUsernameInvalid(){
        Login login = new Login();
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }    
     @Test
     public void testPasswordValid(){
         Login login = new Login();
         assertTrue(login.checkPasswordComplexity("Ch&&secake99"));
     }
     @Test
     public void testPasswordInvalid(){
         Login login = new Login();
         assertFalse(login.checkPasswordComplexity("password"));
     }
     @Test
     public void testCellPhoneValid(){
         Login login = new Login();
         assertTrue(login.checkCellPhoneNumber("+2795284828"));
     }
     @Test
     public void testCellPhoneInvalid(){
         Login login = new Login();
         assertFalse(login.checkCellPhoneNumber ("0895241"));
    }
}
