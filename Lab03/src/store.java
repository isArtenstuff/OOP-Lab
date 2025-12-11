/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, price, totalPrice = 0, change, amountPaid;
        System.out.print("Enter number of items: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("Enter price for items " + i + ": ");
            price = sc.nextInt();
            totalPrice += price;
        }
        System.out.println("Total = " + totalPrice);        
        System.out.print("Enter amout paid: ");
        amountPaid = sc.nextInt();
        change = amountPaid - totalPrice;
        System.out.println("change = " + change);
    }
}
