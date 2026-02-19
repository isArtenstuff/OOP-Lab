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
public class MDIFromGUI {
    JFrame fr;
    JMenuBar mb;
    JMenu file, New, edit, view;
    JMenuItem open, save, exit, window, message;
    JDesktopPane dp;
    JInternalFrame f1, f2, f3;
    public MDIFromGUI(){
        fr = new JFrame("SubMenu Demo");
        fr.setSize(800, 600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        file = new JMenu("File");
        New = new JMenu("New");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        window = new JMenuItem("Window");
        message = new JMenuItem("Message");
        dp = new JDesktopPane();
        f1 = new JInternalFrame("Application 01", true, true, true); f1.setSize(400, 200); f1.setVisible(true);
        f2 = new JInternalFrame("Application 02", true, true, true); f2.setSize(400, 300); f2.setVisible(true);
        f3 = new JInternalFrame("Application 03", true, true, true); f3.setSize(600, 400); f3.setVisible(true);
        
        New.add(window);
        New.addSeparator();
        New.add(message);
        
        file.add(New);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);
        
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        
        dp.add(f1);
        dp.add(f2);
        dp.add(f3);
        
        fr.setJMenuBar(mb);
        fr.add(dp);
        
        
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new MDIFromGUI();
    }
}
