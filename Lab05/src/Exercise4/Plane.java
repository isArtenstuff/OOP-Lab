/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise4;

/**
 *
 * @author Lenovo
 */
public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        this.setFuel(s);
        this.setTopSpeed(t);
    }
    public void fly(){
        if (this.getFuel() >= 200){
            System.out.println("Fly.");
            int cur = this.getFuel();
            cur -= 200;
            this.setFuel(cur);
        } else{
            System.out.println("Please add fuel.");
        }
    }
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is " + this.getFuel() + " litre and Top Speed is " + this.getTopSpeed() + " m/s.");
    }
}
