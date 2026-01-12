/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise3;

/**
 *
 * @author Lenovo
 */
public class FootballPlayer extends Player{
    private String position;
    private int playerNumber;
    public void setPlayerNumber(int n){
        this.playerNumber = n;
    }
    public void setPosition(String p){
        this.position = p;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public String getPosition(){
        return position;
    }
    public boolean isSamePosition(FootballPlayer p){
        return this.position.equals(p.position);
    }
}
