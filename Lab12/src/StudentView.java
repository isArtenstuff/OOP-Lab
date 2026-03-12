/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener {
    JFrame fr;
    JButton dep, with;
    JTextField idField, nameField, moneyField;
    Student student = new Student();
    public StudentView(){
        fr = new JFrame("Student_View");
        fr.setSize(300, 200);
        fr.setLayout(new GridLayout(4,2));
        
        idField = new JTextField();
        nameField = new JTextField();
        moneyField = new JTextField();
        
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        
        dep.addActionListener(this);
        with.addActionListener(this);
        
        fr.addWindowListener(this);
        
        fr.add(new JLabel("ID:"));
        fr.add(idField);
        fr.add(new JLabel("Name"));
        fr.add(nameField);
        fr.add(new JLabel("Money:"));
        fr.add(moneyField);
        fr.add(dep);
        fr.add(with);
        
        loadData();
        
        fr.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        int money = Integer.parseInt(moneyField.getText());
        
        if (e.getSource() == dep){
            money += 100;
        }
        if (e.getSource() == with){
            money -= 100;
        }
        
        moneyField.setText(String.valueOf(money));
    }
    
    public void saveData(){
        student.setName(nameField.getText());
        student.setID(Integer.parseInt(idField.getText()));
        student.setMoney(Integer.parseInt(moneyField.getText()));
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))){
            out.writeObject(student);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void loadData(){
        File f = new File("StudentM.dat");
        
        if (f.exists()){
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))){
                student = (Student) in.readObject();
                nameField.setText(student.getName());
                idField.setText(String.valueOf(student.getID()));
                moneyField.setText(String.valueOf(student.getMoney()));
            }catch(IOException | ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void windowClosing(WindowEvent e){
        saveData();
        System.exit(0);
    }
    
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    
    public static void main(String[] args) {
        new StudentView();
    }
}
