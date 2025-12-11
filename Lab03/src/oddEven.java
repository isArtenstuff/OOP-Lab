/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short input, odd = 0, even = 0;
        while (true){
            input = sc.nextShort();
            if (input == -1){
                break;
            }
            if (input % 2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
            
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
