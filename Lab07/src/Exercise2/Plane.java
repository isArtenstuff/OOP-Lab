/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author LAB203_62
 */
public class Plane extends Vehicle implements Flyable {
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    public Plane(double fuel, String airline, String boeing){
        this.fuel = fuel;
        this.airline = airline;
        this.boeing = boeing;
    }
    public Plane(){
        this(0.0, "", "");
    }
    public void setAirline(String airline){
        this.airline = airline;
    }
    public String getAirline(){
        return this.airline;
    }
    public void setBoeing(String boeing){
        this.boeing = boeing;
    }
    public String getBoeing(){
        return this.boeing;
    }
    @Override
    public void startEngine(){
        if (this.fuel >= 20){
            System.out.println("Plane's Engine starts");
            this.fuel -= 20;
        }
        else{
            System.out.println("Fuel is not enogh.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Plane's Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Weeeeeee");
    }
    @Override
    public void fly(){
        if (this.fuel >= 20){
            System.out.println("Plane Fly");
            this.fuel -= 20;
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void takeOff(){
        if (this.fuel >= 10){
            System.out.println("Plane Already to Take Off");
            this.fuel -= 10;
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    @Override
    public void landing(){
        if (this.fuel >= 10){
            System.out.println("Plane Already to Landing");
            this.fuel -= 10;
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
}
