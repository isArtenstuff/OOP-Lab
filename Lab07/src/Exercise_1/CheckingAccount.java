/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_1;

/**
 *
 * @author Lenovo
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        } 
        else {
            System.out.println("Input number must be positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    @Override
    public void withdraw(double a){
        if (a > 0){
            if (this.getBalance() - a > 0){
                super.withdraw(a);
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if(this.getBalance() - a < 0 && this.getBalance() + this.credit - a > 0){
                this.setBalance(0);
                this.setCredit(this.getBalance() - a + this.getCredit());
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if(this.getBalance() - a < 0 && this.getBalance() + this.credit - a < 0){
                System.out.println("Not enough money!");
            }
        }      
    }
    public void withdraw(String a){
        double A = Double.parseDouble(a);
        if (A > 0){
            if (this.getBalance() - A > 0){
                this.setBalance(this.getBalance() - A);
                System.out.println(A + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if(this.getBalance() - A < 0 && this.getBalance() + this.credit - A > 0){
                this.setBalance(0);
                this.setCredit(this.getBalance() - A + this.getCredit());
                System.out.println(A + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if(this.getBalance() - A < 0 && this.getBalance() + this.credit - A < 0){
                System.out.println("Not enough money!");
            }
        }      
    }
    @Override
    public String toString(){
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }   
}
