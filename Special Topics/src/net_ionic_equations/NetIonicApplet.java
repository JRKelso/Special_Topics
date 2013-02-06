/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import javax.swing.JOptionPane;

/**
 *
 * @author JRKelso
 */
public class NetIonicApplet {
    
    public static void main (String[] args){
        JOptionPane.showMessageDialog(null, "Hello World");
        JOptionPane.showMessageDialog(null, "Something else");
        String something = JOptionPane.showInputDialog(null, "What are you doing?");
        if (something.equalsIgnoreCase("something")){
            JOptionPane.showMessageDialog(null, "You typed in: " + something);
        }
        else {
            JOptionPane.showMessageDialog(null, "You didn't type in \"something\"");
        }
        System.out.println("I don't want this here. Fix my git now");
        System.out.println("New system.out");
    }
    
}
