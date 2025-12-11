/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student, score, excellent = 0, good = 0, fair = 0, poor = 0;
        System.out.print("Enter number of students: ");
        student = sc.nextInt();
        for (int i = 1; i <= student; i++){
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextInt();
            if (score >= 80){
                System.out.println("Excellent");
                excellent += 1;
            } else if (score >= 60 && score <= 79){
                System.out.println("Good");
                good += 1;
            } else if (score >= 50 && score <= 59){
                System.out.println("Fair");
                fair += 1;
            } else {
                System.out.println("Poor");
                poor += 1;
            }
        }
        System.out.println("Summary:");
            System.out.println("Excellent: " + excellent);
            System.out.println("Good: " + good);
            System.out.println("Fair: " + fair);
            System.out.println("Poor: " + poor);
    }
}
