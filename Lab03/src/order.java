/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount, number;
        String text = "";
        System.out.print("Enter number of digits: ");
        amount = sc.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.print("Enter digit " + i + ": ");
            number = sc.nextInt();
            text += number;
        }
        System.out.println("Final Code = " + text);
    }
}
