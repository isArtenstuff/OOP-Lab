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
public class CalculatorOneGUI{
    JFrame fr;
    JPanel p1;
    JTextField txt1, txt2, result;
    JButton plus, sub, mul, div;
    public CalculatorOneGUI(){
        fr = new JFrame();
        fr.setTitle("Calculator");
        fr.setSize(400, 300);
        fr.setLayout(new GridLayout(4, 1));
        txt1 = new JTextField();
        txt2 = new JTextField();
        result = new JTextField();
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        plus = new JButton("PLUS"); sub = new JButton("SUB"); mul = new JButton("MUL"); div = new JButton("DIV");
        
        p1.add(plus);
        p1.add(sub);
        p1.add(mul);
        p1.add(div);
        fr.add(txt1);
        fr.add(txt2);
        fr.add(p1);
        fr.add(result);
        
        fr.setDefaultCloseOperation(3);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
