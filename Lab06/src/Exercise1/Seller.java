/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

/**
 *
 * @author Lenovo
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        double price = new Food().getPrice();
        
        if (e.getWallet().getBalance() >= price){
            this.getWallet().setBalance(this.getWallet().getBalance() + price);
            e.getWallet().setBalance(e.getWallet().getBalance() - price);
            return new Food();
        } else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
