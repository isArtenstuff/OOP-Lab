/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author Lenovo
 */
public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str){
        int energy  = this.getEnergy();
        if (energy >= 10){
            System.out.println("I'm coding about " + str);
        } else{
            System.out.println("ZzZzZz");
        }
        this.setEnergy(energy - 5);
        this.setHappiness(this.getHappiness() - 5);
    }
    public void coding(char str){
        int energy  = this.getEnergy();
        if (energy >= 10){
            System.out.println("I'm coding about " + str);
        } else{
            System.out.println("ZzZzZz");
        }
        this.setEnergy(energy - 5);
        this.setHappiness(this.getHappiness() - 5);
    }
    public void coding(String str, int num){
        for (int x = 1; x <= num; x++){
            this.coding(str);
        }
    }
    public void compliment(Programmer p){
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + " in a good mood");
    }
    public void blame(Programmer p){
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
