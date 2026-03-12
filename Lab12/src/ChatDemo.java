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
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo extends JFrame implements ActionListener, WindowListener {
    JTextArea chatArea;
    JTextField inputField;
    JButton submitBtn, resetBtn;
    
    public ChatDemo(){
        setTitle("ChatDemo");
        setSize(500,500);
        setLayout(new FlowLayout());
        
        chatArea = new JTextArea(20,45);
        chatArea.setEditable(false);
        
        inputField = new JTextField(45);
        
        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        
        submitBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        
        add(new JScrollPane(chatArea));
        add(inputField);
        add(submitBtn);
        add(resetBtn);
        
        addWindowListener(this);
        
        loadChat();
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submitBtn){
            String txt = inputField.getText();
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            
            String time = dtf.format(LocalDateTime.now());
            
            chatArea.append(time + " : " + txt + "\n");
            inputField.setText("");
        }
        if(e.getSource() == resetBtn){
            chatArea.setText("");
        }
    }
    
    public void loadChat(){
        File file = new File("ChatDemo.dat");
        
        if (file.exists()){
            
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                String line;
                
                while ((line = br.readLine()) != null){
                    chatArea.append(line + "\n");
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public void windowClosing(WindowEvent e){
        try(PrintWriter pw = new PrintWriter(new FileWriter("ChatDemo.dat"))){
            pw.print(chatArea.getText());
        }catch(IOException ex){
            ex.printStackTrace();
        }
        System.exit(0);
    }
    
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    
    public static void main(String[] args) {
        new ChatDemo();
    }
}
