/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    JFrame fr;
    JLabel b1, b2;
    JTextField txt1, txt2;
    JPanel p1, p2;
    JButton dep, wit, exit;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setSize(400, 300);
        fr.setLayout(new GridLayout(2, 1));
        b1 = new JLabel("Balance");
        b2 = new JLabel("Amount");
        txt1 = new JTextField("6000");
        txt2 = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        dep = new JButton("Deposit");
        wit = new JButton("Withdraw");
        exit = new JButton("Exit");
        p1.setLayout(new GridLayout(2, 2));
        p1.add(b1);
        p1.add(txt1);
        p1.add(b2);
        p1.add(txt2);
        
        p2.add(dep);
        p2.add(wit);
        p2.add(exit);
        
        fr.add(p1);
        fr.add(p2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
}
