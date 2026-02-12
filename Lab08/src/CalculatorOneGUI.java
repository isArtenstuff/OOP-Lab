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
public class CalculatorOneGUI extends JFrame{
    public CalculatorOneGUI(){
        setTitle("Calculator");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JTextField textField1 = new JTextField();
        add(textField1, BorderLayout.NORTH);
        
        JTextField textField2 = new JTextField();
        add(textField2, BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JButton btnAdd = new JButton("Plus");
        JButton btnSub = new JButton("Sub");
        JButton btnMul = new JButton("Mul");
        JButton btnDiv = new JButton("Div");
        panel.add(btnAdd);
        panel.add(btnSub);
        panel.add(btnMul);
        panel.add(btnDiv);
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    
}
