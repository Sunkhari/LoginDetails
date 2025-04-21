/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.login;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Step 1: Register
        String username = JOptionPane.showInputDialog("Enter a username (must contain underscore and at least 5 characters):");
        String password = JOptionPane.showInputDialog("Enter a password (at least 8 characters, 1 capital letter, 1 number, 1 special character):");
        String phoneNumber = JOptionPane.showInputDialog("Enter your South African cell number (e.g., +27831234567):");

        Login user = new Login(username, password, phoneNumber);

        String registrationMessage = user.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);

        // Only proceed to login if registration was successful
        if (registrationMessage.equals("User registered successfully.")) {
            // Step 2: Login
            String loginUsername = JOptionPane.showInputDialog("Login - Enter username:");
            String loginPassword = JOptionPane.showInputDialog("Login - Enter password:");
            String firstName = JOptionPane.showInputDialog("Enter your first name:");
            String lastName = JOptionPane.showInputDialog("Enter your last name:");

            String loginMessage = user.returnLoginStatus(loginUsername, loginPassword, firstName, lastName);
            JOptionPane.showMessageDialog(null, loginMessage);
        }
    }
}
