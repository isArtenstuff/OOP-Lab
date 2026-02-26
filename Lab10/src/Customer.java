/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class Customer {
    private String firstName, lastName;
    private Account[] acct;
    private int numOfAccount;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        numOfAccount = 0;
    }
    public Customer(){
        this("", "");
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        
        System.out.println(cust);
        
        for (int i = 0; i < cust.getNumOfAccount(); i++){
            cust.getAccount(i).showAccount();
        }
    }
}
