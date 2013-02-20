/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import javax.swing.JRadioButton;

/**
 *
 * @author JRKelso
 */
public class EquationGroup {
    private int id;
    private JRadioButton[] equations = new JRadioButton[3];
    private JRadioButton equation1;
    private JRadioButton equation2;
    private JRadioButton equation3;
    private byte correctAnswer;
    
    public EquationGroup(){
        id = 0;
        equation1 = new JRadioButton("Default1");
        equation2 = new JRadioButton("Default2");
        equation3 = new JRadioButton("Default3");
        equations[0] = equation1;
        equations[1] = equation2;
        equations[2] = equation3;
        correctAnswer = 0;
    }
    
    public EquationGroup(int id, JRadioButton[] eqs){
        
    }
    
    public void setId(int id){
        if (id > 0){
            this.id = id;
        }
    }
    
    public int getId(){
        return id;
    }
    
    public void setEquations(JRadioButton[] eqs){
        equations = eqs;
    }
    
    public JRadioButton[] getEquations(){
        return equations;
    }
    
    public void setCorrectAnswer(byte answer){
        if (answer >= 0 && answer < 3) {
            correctAnswer = answer;
        }
    }
    
    public byte getCorrectAnswer(){
        return correctAnswer;
    }
    
}
