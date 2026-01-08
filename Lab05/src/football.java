/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class football {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        
//        Player p2 = new Player();
//        p2.setName("Khim");
//        p2.setTeam("Gate OR");
//        
//        if(p1.isSameTeam(p2))
//            System.out.println(p1.getName() + " is same team with " + p2.getName());
//        else
//            System.out.println(p1.getName() + " is not same team with " + p2.getName());
//for example 1
        System.out.println(p1.getName());
    }
}
class Player {
    private String name, team;
    public void setName(String n){
        this.name = n;
    }
    public void setTeam(String t){
        this.team = t;
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Player p){
        return this.team.equals(p.team);
    }
}

class FootballPlayer extends Player{
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