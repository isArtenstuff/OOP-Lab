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
import java.awt.event.*;
public class PoringConstructor implements ActionListener {
    JFrame fr;
    JButton addBtn;
    
    int count = 0;
    
    public PoringConstructor(){
        fr = new JFrame("Constructor");
        addBtn = new JButton("Add");
        fr.setLayout(new FlowLayout());
        fr.add(addBtn);
        addBtn.addActionListener(this);
        
        fr.setSize(300,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == addBtn){
            count++;
            new Poring(count);
        }
    }           
}
