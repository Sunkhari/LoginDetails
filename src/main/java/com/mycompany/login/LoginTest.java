/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testValidUsername() {
        Login user = new Login("Sun_1", "Su&&ssc@ke99!", "+27828988977");
        assertTrue(user.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Login user = new Login("kyle!!!!!!", "Ch&&ssc@ke03!", "+27828988977");
        assertFalse(user.checkUserName());
    }

    @Test
    public void testValidPassword() {
        Login user = new Login("Sun_1", "Su&&ssc@ke99!", "+27828988977");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {
        Login user = new Login("Sun_1", "password", "+27828988977");
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testValidCellNumber() {
        Login user = new Login("Sun_1", "Su&&ssc@ke99!", "+27828988977");
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidCellNumber() {
        Login user = new Login("Sun_1", "Su&&ssc@ke99!", "08267553");
        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccess() {
        Login user = new Login("kyl_1", "Ch&&ssc@ke99!", "+27828988977");
        String result = user.returnLoginStatus("kyl_1", "Ch&&sec@ke99!", "Sunkhari", "Ami");
        assertEquals("Welcome Sunkhari, Ami it is great to see you again.", result);
    }

    @Test
    public void testLoginFail() {
        Login user = new Login("Sun_1", "Su&&ssc@ke99!", "+27828988977");
        String result = user.returnLoginStatus("kyl_1", "wrongPass", "Sunkhari", "Ami");
        assertEquals("Username or password incorrect, please try again.", result);
    }
}
