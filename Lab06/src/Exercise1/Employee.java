/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private int energy;
    private Wallet wallet;
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public static String getNationality(){
        return nationality;
    }
    public String getName(){
        return this.name;
    }
    public int getEnergy(){
        return this.energy;
    }
    public Wallet getWallet(){
        return this.wallet;
    }
    public boolean equals(Employee e){
        return this.getName().equals(e.getName());
    }
    
    @Override
    public String toString(){
        String output = "My name is " + this.getName() + ".\nI have " + this.getEnergy() + " energy left.\nI have a balance of " + this.getWallet().getBalance() + " baht.";
        return output;
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if (f != null){
            eat(f);
            return true;
        } else{
            return false;
        }
    }
    
}
