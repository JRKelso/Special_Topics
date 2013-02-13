/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;

/**
 *
 * @author JRKelso
 */
public class NetIonicApplet extends JApplet{
    
    //Comboboxes the selection of solutes goes into
    private JComboBox jcbSolute1 = new JComboBox();
    private JComboBox jcbSolute2 = new JComboBox();
    
    //Radio buttons to select the correct Net-Ionic Equation (NIE)
    private JRadioButton equation1 = new JRadioButton("Equation1");
    private JRadioButton equation2 = new JRadioButton("Equation2");
    private JRadioButton equation3 = new JRadioButton("Equation3");
    
    //Panels
    private JPanel chemicalPanel = new JPanel();
    private JPanel equationsPanel = new JPanel();
    
    public void init(){
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbl.setConstraints(this, gbc);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = gbc.weighty = 2;
        gbc.insets = new Insets(2,2,2,2);
        //Set the applet window to be a GridBagLayout
        this.setLayout(gbl);
        
        
        //Panel with PApplet, JComboBoxes, and Buttons in it
        JPanel chemicalPanel = new JPanel();
        this.add(chemicalPanel, gbc);
        chemicalPanel.setLayout(gbl);
        
        //Solute 1 Combo Box properties
        gbc.gridwidth=10;
        chemicalPanel.add(jcbSolute1, gbc);
        
        //Solute 2 Combo Box properties
        gbc.gridx = 1;
        gbc.gridy = 0;
        chemicalPanel.add(jcbSolute2, gbc);
        
        gbc.gridwidth=1;
        JButton jbMix = new JButton("Mix");
        gbc.gridx = 0;
        gbc.gridy = 1;
        chemicalPanel.add(jbMix, gbc);
        
        gbc.weightx = gbc.weighty = 2;
        equationsPanel.setLayout(gbl);
        equationsPanel.setBorder(BorderFactory.createTitledBorder(new BevelBorder(BevelBorder.LOWERED), "Net-Ionic Equations"));
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth=10;
        this.add(equationsPanel, gbc);
        
        gbc.gridwidth=1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        equationsPanel.add(equation1, gbc);
        gbc.gridy = 1;
        equationsPanel.add(equation2, gbc);
        gbc.gridy = 2;
        equationsPanel.add(equation3, gbc);
        
        
        this.setSize(800,480);
    }
    
}
