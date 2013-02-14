/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import processing.core.*;
/**
 *
 * @author JRKelso
 */
public class NetIonicApplet extends JApplet{
    
    //Comboboxes the selection of solutes goes into
    private JComboBox jcbSolute1 = new JComboBox();
    private JComboBox jcbSolute2 = new JComboBox();
    
    //Buttons
    private JButton jbMix = new JButton("Mix");
    private JButton jbPour = new JButton("Pour");
    private JButton jbPeriodic = new JButton("Periodic Table");
    
    //Radio buttons to select the correct Net-Ionic Equation (NIE)
    private JRadioButton equation1 = new JRadioButton("Equation1");
    private JRadioButton equation2 = new JRadioButton("Equation2");
    private JRadioButton equation3 = new JRadioButton("Equation3");
    
    //Panels
    private JPanel interactionPanel = new JPanel(new BorderLayout()); //Contains the combo, chemical, and button Panels
    private JPanel comboPanel = new JPanel(new BorderLayout()); //Contains comboboxes
    private JPanel chemicalPanel = new JPanel(); //Contains PApplet
    private JPanel buttonPanel = new JPanel(new BorderLayout()); //contains Mix & Pour buttons
    private JPanel equationsPanel = new JPanel(new BorderLayout()); //Contains equations to pick from
    private JPanel mixPanel = new JPanel(); //Panel for the mix button
    private JPanel pourPanel = new JPanel(); //Panel for the pour button
    private JPanel solute1Panel = new JPanel(); //Panel for the solute1 combobox
    private JPanel solute2Panel = new JPanel(); //Panel for the solute2 combobox
    private JPanel solute1LabelPanel = new JPanel(); //Panel for the solute1 label
    private JPanel solute2LabelPanel = new JPanel(); //Panel for the solute2 label
    private JPanel combinePanel1 = new JPanel(new BorderLayout()); //panel to combine combobox and label together
    private JPanel combinePanel2 = new JPanel(new BorderLayout()); //panel to combine combobox and label together
    private JPanel netIonicPanel = new JPanel(new BorderLayout()); //panel for the net-ionic
    private JPanel periodicPanel = new JPanel();
    
    //Labels
    private JLabel jlblSolute1 = new JLabel("Solute 1");
    private JLabel jlblSolute2 = new JLabel("Solute 2");
    
    public void init(){

        this.setLayout(new BorderLayout());
        //Add panels to the interaction panel
        interactionPanel.add(comboPanel, BorderLayout.NORTH);
        interactionPanel.add(chemicalPanel, BorderLayout.CENTER);
        interactionPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        netIonicPanel.setBorder(BorderFactory.createTitledBorder(new BevelBorder(BevelBorder.LOWERED), "Net-Ionic Equations"));
        
        //Add the panels to the JApplet
        this.add(interactionPanel, BorderLayout.CENTER);
        this.add(netIonicPanel, BorderLayout.SOUTH);
        
        jbMix.setPreferredSize(new Dimension(75,40));
        jbPour.setPreferredSize(new Dimension(75,40));

        //Add buttons to buttonPanel
        mixPanel.add(jbMix);
        pourPanel.add(jbPour);
        
        solute1LabelPanel.add(jlblSolute1);
        solute2LabelPanel.add(jlblSolute2);
        
        buttonPanel.add(mixPanel, BorderLayout.WEST);
        buttonPanel.add(pourPanel, BorderLayout.EAST);
        
        jcbSolute1.setPreferredSize(new Dimension(100,20));
        jcbSolute2.setPreferredSize(new Dimension(100,20));
        solute1Panel.add(jcbSolute1);
        solute2Panel.add(jcbSolute2);
        
        combinePanel1.add(solute1LabelPanel, BorderLayout.NORTH);
        combinePanel1.add(solute1Panel, BorderLayout.CENTER);
        combinePanel2.add(solute2LabelPanel, BorderLayout.NORTH);
        combinePanel2.add(solute2Panel, BorderLayout.CENTER);
        
        PApplet sketch = new SimpleTest();
        chemicalPanel.add(sketch);
        sketch.init();
        
        //Add comboboxes to comboPanel
        comboPanel.add(combinePanel1, BorderLayout.WEST);
        comboPanel.add(combinePanel2, BorderLayout.EAST);
        
        equationsPanel.add(equation1, BorderLayout.NORTH);
        equationsPanel.add(equation2, BorderLayout.CENTER);
        equationsPanel.add(equation3, BorderLayout.SOUTH);
        jbPeriodic.setPreferredSize(new Dimension(125,60));
        periodicPanel.add(jbPeriodic);
        
        netIonicPanel.add(equationsPanel, BorderLayout.WEST);
        netIonicPanel.add(periodicPanel, BorderLayout.EAST);
      
        
        this.setSize(800,480);
    }
    
}