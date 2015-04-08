/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    
    //Element Arrays
    private String[] solute1;
    private String[] solute2Set1;
    private String[] solute2Set2;
    private String[] solute2Set3;
    private String[] solute2Set4;
    
    //Buttons
    private JButton jbAdd = new JButton("Add Solutes");
    private JButton jbPour = new JButton("Pour");
    private JButton jbPeriodic = new JButton("Periodic Table");
    
    private ButtonGroup bg = new ButtonGroup();
    
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
    private JPanel periodicPanel = new JPanel(); //Panel that contains period table button
    private JPanel regularEq = new JPanel(new BorderLayout());
    
    //Labels
    private JLabel jlblSolute1 = new JLabel("Solute 1");
    private JLabel jlblSolute2 = new JLabel("Solute 2");
    private JLabel jlblRegEq = new JLabel("Default");
    
    //Strings
    private String sodium = "Sodium(Na)";
    private String iron = "Iron(Fe)";
    private String hydrogen = "Hydrogen(H)";
    private String copper = "Copper(Cu)";
    private String lead = "Lead(Pb)";
    private String silver = "Silver(Ag)";
    
    //Answer
    Byte answer = 0;
    
    public void init(){
        solute1 = new String[]{sodium,iron,hydrogen,copper};
        for(int i = 0; i < solute1.length; i++){
            jcbSolute1.addItem(solute1[i]);
        }
        solute2Set1 = new String[]{iron,hydrogen,copper,lead,silver};
        for (int i = 0; i < solute2Set1.length; i++){
            jcbSolute2.addItem(solute2Set1[i]);
        }
        solute2Set2 = new String[]{lead,hydrogen,sodium,silver};
        solute2Set3 = new String[]{lead,silver,sodium,iron};
        solute2Set4 = new String[]{lead,sodium,silver};

        this.setLayout(new BorderLayout());
        //Add panels to the interaction panel
        interactionPanel.add(comboPanel, BorderLayout.NORTH);
        interactionPanel.add(chemicalPanel, BorderLayout.CENTER);
        interactionPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        netIonicPanel.setBorder(BorderFactory.createTitledBorder(new BevelBorder(BevelBorder.LOWERED), "Net-Ionic Equations"));
        
        //Add the panels to the JApplet
        this.add(interactionPanel, BorderLayout.CENTER);
        this.add(netIonicPanel, BorderLayout.SOUTH);
        
        jbAdd.setPreferredSize(new Dimension(110,40));
        jbPour.setPreferredSize(new Dimension(75,40));

        //Add buttons to buttonPanel
        mixPanel.add(jbAdd);
        pourPanel.add(jbPour);
        
        jbAdd.addActionListener(new ButtonListener());
        
        regularEq.add(new JLabel("Regular Equation"), BorderLayout.NORTH);
        regularEq.add(jlblRegEq, BorderLayout.CENTER);
        
        solute1LabelPanel.add(jlblSolute1);
        solute2LabelPanel.add(jlblSolute2);
        
        buttonPanel.add(mixPanel, BorderLayout.WEST);
        buttonPanel.add(pourPanel, BorderLayout.EAST);
        
        jcbSolute1.setPreferredSize(new Dimension(100,20));
        jcbSolute2.setPreferredSize(new Dimension(100,20));
        
        jcbSolute1.addActionListener(new DropListener());
        
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
        
        //adds equation radio buttons to button group
        bg.add(equation1);
        bg.add(equation2);
        bg.add(equation3);
        
        //ActionListeners for the RadioButtons
        AnswerListener answerListener = new AnswerListener();
        equation1.addActionListener(answerListener);
        equation2.addActionListener(answerListener);
        equation3.addActionListener(answerListener);
        
        radioDisable();
        
        //adds radio buttons to the equations panel
        equationsPanel.add(equation1, BorderLayout.NORTH);
        equationsPanel.add(equation2, BorderLayout.CENTER);
        equationsPanel.add(equation3, BorderLayout.SOUTH);
        
        //set size of periodic table button
        jbPeriodic.setPreferredSize(new Dimension(125,60));
        periodicPanel.add(jbPeriodic);
        
        
        netIonicPanel.add(regularEq, BorderLayout.CENTER);
        netIonicPanel.add(equationsPanel, BorderLayout.WEST);
        netIonicPanel.add(periodicPanel, BorderLayout.EAST);
      
        regularEq.setVisible(false);
        
        this.setSize(800,480); //set the JApplet size to 800x480
    }
    
    public void radioEnable(){
        equation1.setEnabled(true);
        equation2.setEnabled(true);
        equation3.setEnabled(true);
    }
    
    public void radioDisable(){
        equation1.setEnabled(false);
        equation2.setEnabled(false);
        equation3.setEnabled(false);
    }
    
    class DropListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (jcbSolute1.getSelectedIndex() == 0){
                jcbSolute2.removeAllItems();
                for (int i=0;i<solute2Set1.length;i++){
                    jcbSolute2.addItem(solute2Set1[i]);
                }
            }
            else if (jcbSolute1.getSelectedIndex() == 1){
                jcbSolute2.removeAllItems();
                for (int i = 0;i < solute2Set2.length;i++){
                    jcbSolute2.addItem(solute2Set2[i]);
                }
            }
            else if (jcbSolute1.getSelectedIndex() == 2){
                jcbSolute2.removeAllItems();
                for (int i = 0; i < solute2Set3.length; i++){
                    jcbSolute2.addItem(solute2Set3[i]);
                }
            }
            else if (jcbSolute1.getSelectedIndex() == 3){
                jcbSolute2.removeAllItems();
                for (int i = 0; i < solute2Set4.length; i++){
                    jcbSolute2.addItem(solute2Set4[i]);
                }
            }
        }
    }
    
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == jbAdd){
                EquationSelector es = new EquationSelector();
                EquationGroup eg = es.select(jcbSolute1.getSelectedItem().toString(), jcbSolute2.getSelectedItem().toString(), jlblRegEq);
                JRadioButton[] eqs = eg.getEquations();
                
                equation1.setText(eqs[0].getText());
                equation2.setText(eqs[1].getText());
                equation3.setText(eqs[2].getText());
                
                answer = eg.getCorrectAnswer();
                
                jcbSolute1.setEnabled(false);
                jcbSolute2.setEnabled(false);
                jbAdd.setEnabled(false);
                
                radioEnable();
            }
        }
    }
    
    class AnswerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (answer == 0){
                equation1.setBackground(Color.GREEN);
                equation2.setBackground(Color.RED);
                equation3.setBackground(Color.RED);
                radioDisable();
                if (!equation1.isSelected()){
                    regularEq.setVisible(true);
                }
            }
            else if (answer == 1){
                equation1.setBackground(Color.RED);
                equation2.setBackground(Color.GREEN);
                equation3.setBackground(Color.RED);
                radioDisable();
                if (!equation2.isSelected()){
                    regularEq.setVisible(true);
                }
            }
            else if (answer == 2){
                equation1.setBackground(Color.RED);
                equation2.setBackground(Color.RED);
                equation3.setBackground(Color.GREEN);
                radioDisable();
                if (!equation3.isSelected()){
                    regularEq.setVisible(true);
                }
            }
        }
    }
    
}
