/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        String text = "", consonant = "";
        while (true){
            System.out.print("Enter a character: ");
            input = sc.next().charAt(0);
            if (input == 'z'){
                break;
            } else if (Character.isLetter(input)){
                text += input;
                if ("aeiou".indexOf(input) == -1){
                    consonant += input;
                }
            } else{
                System.out.println("Invalid input. Only lowcase a-z are allowed");
            }
        }
        System.out.println("All characters  entered: " + text);
        System.out.println("Consonants only: " + consonant);
    }
}
