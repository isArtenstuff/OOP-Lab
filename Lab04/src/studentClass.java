/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class studentClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }
}
class Student {
    String name;
    double mScore;
    double fScore;
    void showGrade(){
        double s = (mScore * 0.4) + (fScore * 0.4) + 20;
        String grade;
        if (s >= 80){
            grade = "A";
        } else if (s < 80 && s >= 70){
            grade = "B";
        } else if (s < 70 && s >= 60){
            grade = "C";
        } else if(s < 60 && s >= 50){
            grade = "D";
        } else{
            grade = "F";
        }
        System.out.println("Your grade is " + grade + ".");
    }
}
