/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise4;

/**
 *
 * @author Lenovo
 */
public class Car extends Vehicle{
    private String typeEngine;
    public void setTypeEngine(String t) { this.typeEngine = t; }
    public String getTypeEngine() { return this.typeEngine; }
    public void setCarInfo(int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void move(){
        int cur = this.getFuel();
        if (cur >= 50){
            System.out.println("Move.");
            cur -= 50;
            this.setFuel(cur);
        } else { System.out.println("Please add fuel."); }
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + this.getTypeEngine() + ".");
        System.out.println("Fuel is " + this.getFuel() + " litre and Top Speed is " + this.getTopSpeed() + " m/s.");
    }
}
