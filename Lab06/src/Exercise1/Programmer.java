/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author Lenovo
 */
public class Programmer extends Employee{
    private int happiness;
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
    public int getHappiness(){
        return this.happiness;
    }
    public void coding(String str){
        int energy = this.getEnergy();
        if (energy >= 30){
            System.out.println("Your code is " + str);
        } else{
            System.out.println("Error Error Error");
        }
        this.setEnergy(energy - 30);
        this.setHappiness(this.getHappiness() - 30);
    }
    public void coding(char str){
        int energy = this.getEnergy();
        if (energy >= 30){
            System.out.println("Your code is " + str);
            this.setEnergy(energy - 30);
            this.setHappiness(this.getHappiness() - 30);
        } else{
            System.out.println("Error Error Error");
            this.setEnergy(energy - 30);
            this.setHappiness(this.getHappiness() - 30);
        }
    }
}
