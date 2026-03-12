/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame(){
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        add(clock, BorderLayout.CENTER);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        t.start();
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
