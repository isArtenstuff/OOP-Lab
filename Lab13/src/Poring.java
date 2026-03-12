/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.event.*;
public class Poring implements Runnable, MouseListener{
    JLabel la;
    JFrame fr;
    Thread t;

    public Poring(int num){
        fr = new JFrame("Poring");
        ImageIcon icon = new ImageIcon(getClass().getResource("poring.png"));
        la = new JLabel(icon);
        
        fr.add(la);
        la.addMouseListener(this);
        
        fr.setSize(200, 200);
        fr.pack();
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setVisible(true);
        
        t = new Thread(this);
        t.start();
    }
    
    public void run(){
        try{
            while (true){
                Thread.sleep(1000);
            }
        }catch(Exception e){}
    }
    
    public void mouseClicked(MouseEvent e){
        fr.dispose();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}
