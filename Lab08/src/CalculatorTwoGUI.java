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
public class CalculatorTwoGUI {
    JFrame fr;
    JTextField txt;
    JPanel p2;
    JButton zero, one, two, three, four, five, six, seven, eight, nine, plus, sub, mul, div, equal, reset;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        fr.setSize(400, 300);
        txt = new JTextField();
        p2 = new JPanel(); p2.setLayout(new GridLayout(4, 4));
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        plus = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        equal = new JButton("=");
        reset = new JButton("c");
        
        p2.add(seven);
        p2.add(eight);
        p2.add(nine);
        p2.add(plus);
        
        p2.add(four);
        p2.add(five);
        p2.add(six);
        p2.add(sub);
        
        p2.add(one);
        p2.add(two);
        p2.add(three);
        p2.add(mul);
        
        p2.add(zero);
        p2.add(reset);
        p2.add(equal);
        p2.add(div);
        
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
