/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, max = 0, min = Integer.MAX_VALUE;
        while (true){
            System.out.print("Enter a number (-1 to stop): ");
            input = sc.nextInt();
            if(input == -1){
                break;
            } else{
                if (input > max){
                    max = input;
                }
                if (input < min){
                    min = input;
                }
            }
        }
        if (max == 0 && min == Integer.MAX_VALUE){
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
        }
    }
}
