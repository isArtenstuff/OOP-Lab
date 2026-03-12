/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.util.Calendar;
import java.awt.*;
public class MyClock extends JLabel implements Runnable {
    public MyClock(){
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Arial", Font.BOLD, 80));
    }
    public void run(){
        try{
            while(true){
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                
                setText(hour + ":" + min + ":" + sec);
                Thread.sleep(1000);
            }
        }catch(Exception e){}
    }
}
