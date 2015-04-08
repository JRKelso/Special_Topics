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
    private JRadioButton[] equations = new JRadioButton[3];
    private JRadioButton equation1;
    private JRadioButton equation2;
    private JRadioButton equation3;
    private byte correctAnswer;
    
    public EquationGroup(){
        equation1 = new JRadioButton("Default1");
        equation2 = new JRadioButton("Default2");
        equation3 = new JRadioButton("Default3");
        equations[0] = equation1;
        equations[1] = equation2;
        equations[2] = equation3;
        correctAnswer = 0;
    }
    
    public void setEquations(String eq1, String eq2, String eq3){
        equation1.setText(eq1);
        equation2.setText(eq2);
        equation3.setText(eq3);
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
