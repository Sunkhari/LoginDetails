/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;
import java.util.regex.*;

public class Login {
    private String username;
    private String password;
    private String cellPhone;

    public Login(String username, String password, String cellPhone) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
    }

    public boolean checkUserName() {
        return username.contains("-") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        String pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return password.matches(pattern);
    }

    public boolean checkCellPhoneNumber() {
        // Must start with +27 and have 9 more digits
        String pattern = "^\\+27\\d{9}$";
        return cellPhone.matches(pattern);
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code, please correct the number and try again.";
        }
        return "User registered successfully.";
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword, String firstName, String lastName) {
        if (this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
