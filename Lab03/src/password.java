/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwordInput, correctPassword = "PASS2025";
        while (true){
            System.out.print("Enter password: ");
            passwordInput = sc.nextLine();
            if (passwordInput.equals(correctPassword)){
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
