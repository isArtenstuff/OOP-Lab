/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JTextField display;
    private String value_1 = "";
    private String value_2 = "";
    private String operator = "";
    private boolean isOperatorClicked = false;
    public static void main(String[] args) {
        new CalculatorSample();
    }
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        fr.add(display, BorderLayout.NORTH);
        
        JPanel button = new JPanel(new GridLayout(4, 4));
        String[] labels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "x",
            "0", "C", "=", "/"
        };
        for (String text : labels){
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            button.add(btn);
        }
        
        fr.add(button, BorderLayout.CENTER);
        fr.pack();
        fr.setSize(400, 300);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        System.out.println(command);
        
        if (command.equals("C")){
            display.setText("");
            value_1 = "";
            operator = "";
        }
        else if(command.equals("=")){
            if (!value_1 .equals("") && !display.getText().equals("")){
                value_2 = display.getText();
                calculate(Double.parseDouble(value_2));
            }
            operator = "";
        }
        else if("+-x/".contains(command)){
            value_1 = display.getText();
            operator = command;
            display.setText("");
        }
        else{
            display.setText(display.getText() + command);
        }
    }
    
    private void calculate(double value_2){
        double firstValue = Double.parseDouble(value_1);
        String result = "";
        
        switch (operator){
            case "+": result = String.valueOf(firstValue + value_2); break;
            case "-": result = String.valueOf(firstValue - value_2); break;
            case "x": result = String.valueOf(firstValue * value_2); break;
            case "/": result = String.valueOf(firstValue / value_2); break;
        }
        
        display.setText(String.valueOf(result));
    }
}

