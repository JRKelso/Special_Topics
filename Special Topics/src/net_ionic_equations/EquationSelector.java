/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;

import javax.swing.JLabel;


/**
 *
 * @author JRKelso
 */
public class EquationSelector {
    
    private String sodium = "Sodium(Na)";
    private String iron = "Iron(Fe)";
    private String hydrogen = "Hydrogen(H)";
    private String copper = "Copper(Cu)";
    private String lead = "Lead(Pb)";
    private String silver = "Silver(Ag)";
    private Byte answer = 0;
    
    public EquationSelector(){
        
    }
    
    public EquationGroup select(String solute1, String solute2, JLabel regEq){
        EquationGroup eg = new EquationGroup();
        if (solute1.equals(sodium) && solute2.equals(iron) || solute1.equals(iron) && solute2.equals(sodium)){
            eg.setEquations("Na\u207A + Cl\u207B \u2192 NaCl\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + 3OH\u207B \u2192 Fe(OH)\u2083\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + OH\u207B \u2192 Fe(OH)\u208D\u2088\u208E");
            answer = 1;
            eg.setCorrectAnswer(answer);
            regEq.setText("3NaOH + FeCl\u2083 \u2192 3NaCl + Fe(OH)\u2083");
        }
        else if (solute1.equals(sodium) && solute2.equals(hydrogen) || solute1.equals(hydrogen) && solute2.equals(sodium)){
            eg.setEquations("3Na\u207A + PO\u2084\u00B3\u207B \u2192 Na\u2083PO\u2084\u208D\u2088\u208E",
                    "H\u207A\u208D\u2088\u208E + NO\u207B\u2083\u208D\u2088\u208E \u2192 HNO\u2083",
		    "3H\u207A + PO\u20840\u00B3\u207B \u2192 H\u2083PO\u2084\u208D\u2088\u208E");
            answer = 2;
            eg.setCorrectAnswer(answer);
            regEq.setText("Na\u2083PO\u2084\u00B3\u207B \u2192 3NaNO\u2083 + H\u2083PO\u2084");
        }
        else if (solute1.equals(sodium) && solute2.equals(copper) || solute1.equals(copper) && solute2.equals(sodium)){
            eg.setEquations("Cu\u00B2\u207A + 2OH\u207B\u208D\u2088\u208E \u2192 Cu(OH)\u2082\u208D\u2088\u208E",
                    "Cu\u207A\u208D\u2088\u208E + OH\u207B\u208D\u2088\u208E \u2192 CuOH",
                    "2Na\u207A + Cu\u00B2\u207A \u2192 Na\u2082Cu\u208D\u2088\u208E");
            regEq.setText("2NaOH + CuF\u2082 \u2192 2NaF + Cu(OH)\u2082");
        }
        else if (solute1.equals(sodium) && solute2.equals(lead)){
            eg.setEquations("2Pb\u207A + 2SO\u2084\u207B \u2192 PbSO\u2084\u208D\u2088\u208E",
                    "Na\u207A + NO\u2083 \u2192 NaNO\u2083\u208D\u2088\u208E",
                    "Pb\u00B2\u207A + SO\u2084\u00B2\u207B \u2192 PbSO\u2084\u208D\u2088\u208E");
            answer = 2;
            eg.setCorrectAnswer(answer);
            regEq.setText("Na\u2082SO\u2084 + Pb(NO\u2083)\u2082 \u2192 2NaNO\u2083 + PbSO\u2084");
        }
        else if (solute1.equals(sodium) && solute2.equals(silver)){
            eg.setEquations("Ag\u00b2\u207A + 2Cl\u207B \u2192 AgCl\u208D\u2088\u208E",
                    "Ag\u207A + Cl\u207B \u2192 AgCl\u208D\u2088\u208E",
                    "Na\u207A + Cl\u207B \u2192 NaCl\u208D\u2088\u208E");
            answer = 1;
            eg.setCorrectAnswer(answer);
            regEq.setText("NaCl + AgNO\u2083 \u2192 NaNO\u2083 + AgCl");
        }
        else if (solute1.equals(iron) && solute2.equals(hydrogen)){
            eg.setEquations("3H\u207A + 3F\u207B \u2192 3HF\u208D\u2088\u208E",
                    "H\u207A + F\u207B \u2192 HF\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + 3H\u207B \u2192 FeF\u2083\u208D\u2088\u208E");
            answer = 1;
            eg.setCorrectAnswer(answer);
            regEq.setText("FeF\u2083 + 3HCl \u2192 FeCl\u2083 + 3HF");
        }
        else if (solute1.equals(iron) && solute2.equals(lead)){
            eg.setEquations("SO\u2084\u00B2\u207B + Pb\u00B2\u207A \u2192 PbSO\u2084", 
                    "Fe\u00B3\u207A + NO\u2083\u207B \u2192 Fe(NO\u2083)\u2083", 
                    "Pb\u00B2\u207A + 2NO\u2083\u208B \u2192 Pb(NO\u2083)\u2082");
            regEq.setText("Fe\u2082(SO\u2084)\u2083 + 3Pb(NO\u2083)\u2082 \u2192 2Fe(NO\u2083)\u2083 + 3PbSO\2084");
        }
        else if (solute1.equals(iron) && solute2.equals(silver)){
            eg.setEquations("Cl\u207B + Ag\u207A \u2192 AgCl",
                    "NO\u2083\u207A + Cl\u207B \u2192 ClNO\u2083\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + 3NO\u2083\u207B \u2192 Fe(NO\u2083)\u2083\u208D\u2088\u208E");
            regEq.setText("FeCl\u2083 + 3AgNO\u2083 \u2192 Fe(NO\u2083)\u2083 + 3AgCl");
        }
        else if (solute1.equals(hydrogen) && solute2.equals(lead)){
            eg.setEquations("Pb\u00B2\u207A + 2NO\u2083\u207B \u2192 Pb(NO\u2083)\u2082",
                    "H\u207A + NO\u2083\u207B \u2192 HNO\u2083",
                    "Pb\u00B2\u207A + SO\u2084\u00B2\u207B \u2192 PbSO\u2084");
            answer = 2;
            eg.setCorrectAnswer(answer);
            regEq.setText("H\u2082SO\u2084 + Pb(NO\u2083)\u2082 \u2192 PbSO\u2084 + 2HNO\u2083");
        }
        else if (solute1.equals(hydrogen) && solute2.equals(silver)){
            eg.setEquations("H\u207A + NO\u2083\u207B \u2192 HNO\u2083",
                    "H\u207A + Cl\u207B + Ag\u207A \u2192 AgCl",
                    "Ag\u207A + Cl\u207B \u2192 AgCl");
            answer = 2;
            eg.setCorrectAnswer(answer);
            regEq.setText("HCl + AgNO\u2083 \u2192 AgCl + HNO\u2083");
        }
        else if (solute1.equals(copper) && solute2.equals(silver)){
            eg.setEquations("Cu\u00B2\u207A + 2Ag\u207B \u2192 CuAg\u2082",
                    "SO\u2084\u00B2\u207B + 2Ag\u207A \u2192 Ag\u2082SO\u2084",
                    "Cu\u00B2\u207A + 2NO\u2083\u207B \u2192 Cu*NO\u2083)\u2082");
            answer = 1;
            eg.setCorrectAnswer(answer);
            regEq.setText("CuSO\u2084 + 2AgNO\u2083 \u2192 Cu(NO\u2083)\u2082 + AgSO\u2084");
        }
        else if (solute1.equals(copper) && solute2.equals(lead)){
            eg.setEquations("F\u207B + Pb\u00B2\u207A \u2192 PbF\u2082",
                    "Cu\u00B2\u207A + NO\u2083\u207B \u2192 Cu(NO\u2083)\u2082",
                    "F\u00B2\u207B + Pb\u00B2\u207A \u2192 PbF");
            regEq.setText("CuF\u2082 + Pb(NO\u2083)\u2082 \u2192 Cu(NO\u2083)\u2082 + PbF\u2082");
            
        }
        return eg;
    }
    
}
