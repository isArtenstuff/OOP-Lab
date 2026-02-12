/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author LAB203_62
 */
public class Ship extends Vehicle implements Floatable {
    public Ship(double fuel){
        super(fuel);
    }
    public Ship(){
        super(0.0);
    }
    @Override
    public void fl0at(){
        if (this.fuel >= 50){
            this.fuel -= 50;
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enogh.");
        }
    }
    @Override
    public void startEngine(){
        if (this.fuel >= 10){
            this.fuel -= 10;
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enogh.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        for (int x = distance; x > 0; x--){
            this.fl0at();
            if (this.fuel < 50){
                break;
            }
        }
    }
}
