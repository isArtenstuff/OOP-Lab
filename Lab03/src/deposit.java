/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short amount, allMoney = 0, target = 1000, count = 0;
        while (target > 0){
            count += 1;
            System.out.print("Enter deposit amount: ");
            amount = sc.nextShort();
            target -= amount;
            allMoney += amount;
        }
        System.out.println("Target reached!");
        System.out.println("Total amount saved = " + allMoney);
        System.out.println("Number of deposit = " + count);
    }
}
