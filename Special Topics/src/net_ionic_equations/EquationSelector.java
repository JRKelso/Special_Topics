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
public class EquationSelector {
    
    public EquationSelector(){
        
    }
    
    public EquationGroup select(String solute1, String solute2){
        EquationGroup eg = new EquationGroup();
        if (solute1.equals("Na") && solute2.equals("Fe")){
            eg.setEquations("Fe\u00B3\u207A + 3OH\u207B \u2192 Fe(OH)\u2083\u208D\u2088\u208E",
                    "Na\u207A + Cl\u207B \u2192 NaCl\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + OH\u207B \u2192 Fe(OH)\u208D\u2088\u208E");
        }
        else if (solute1.equals("Na") && solute2.equals("H")){
            eg.setEquations("3H\u207A + PO\u20840\u00B3\u207B \u2192 H\u2083PO\u2084\u208D\u2088\u208E",
                    "3Na\u207A + PO\u2084\u00B3\u207B \u2192 Na\u2083PO\u2084\u208D\u2088\u208E",
                    "H\u207A\u208D\u2088\u208E + NO\u207B\u2083\u208D\u2088\u208E \u2192 HNO\u2083");
            
        }
        else if (solute1.equals("Na") && solute2.equals("Cu")){
            eg.setEquations("Cu\u00B2\u207A + 2OH\u207B\u208D\u2088\u208E \u2192 Cu(OH)\u2082\u208D\u2088\u208E",
                    "Cu\u207A\u208D\u2088\u208E + OH\u207B\u208D\u2088\u208E \u2192 CuOH",
                    "2Na\u207A +_Cu\u00B2\u207A \u2192 Na\u2082Cu\u208D\u2088\u208E");
        }
        else if (solute1.equals("Na") && solute2.equals("Pb")){
            eg.setEquations("Pb\u00B2\u207A + SO\u2084\u00B2\u207B \u2192 PbSO\u2084\u208D\u2088\u208E",
                    "Na\u207A + NO\u2083 \u2192 NaNO\u2083\u208D\u2088\u208E",
                    "2Pb\u207A + 2SO\u2084\u207B \u2192 PbSO\u2084\u208D\u2088\u208E");
        }
        else if (solute1.equals("Na") && solute2.equals("Ag")){
            eg.setEquations("Ag\u207A + Cl\u207B \u2192 AgCl\u208D\u2088\u208E",
                    "Ag\u00b2\u207A + 2Cl\u207B \u2192 AgCl\u208D\u2088\u208E",
                    "Na\u207A + Cl\u207B \u2192 NaCl\u208D\u2088\u208E");
        }
        else if (solute1.equals("Fe") && solute2.equals("H")){
            eg.setEquations("H\u207A + F\u207B \u2192 HF\u208D\u2088\u208E",
                    "3H\u207A + 3F\u207B \u2192 3HF\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + 3H\u207B \u2192 FeF\u2083\u208D\u2088\u208E");
        }
        else if (solute1.equals("Fe") && solute2.equals("Pb")){
            eg.setEquations("SO\u2084\u00B2\u207B + Pb\u00B2\u207A \u2192 PbSO\u2084",
                    "Fe\u00B3\u207A + NO\u2083\u207B \u2192 Fe(NO\u2083)\u2083",
                    "Pb\u00B2\u207A + 2NO\u2083\u208B \u2192 Pb(NO\u2083)\u2082");
        }
        else if (solute1.equals("Fe") && solute2.equals("Ag")){
            eg.setEquations("Cl\u207B + Ag\u207A \u2192 AgCl",
                    "NO\u2083\u207A + Cl\u207B \u2192 ClNO\u2083\u208D\u2088\u208E",
                    "Fe\u00B3\u207A + 3NO\u2083\u207B \u2192 Fe(NO\u2083)\u2083\u208D\u2088\u208E");
        }
        else if (solute1.equals("H") && solute2.equals("Pb")){
            eg.setEquations("Pb\u00B2\u207A + SO\u2084\u00B2\u207B \u2192 PbSO\u2084",
                    "H\u207A +_NO\u2083\u207B \u2192 HNO\u2083",
                    "Pb\u00B2\u207A + 2NO\u2083\u207B \u2192 Pb(NO\u2083)\u2082");
        }
        else if (solute1.equals("H") && solute2.equals("Ag")){
            eg.setEquations("Ag\u207A + Cl\u207B \u2192 AgCl",
                    "H\u207A + Cl\u207B + Ag\u207A \u2192 AgCl",
                    "H\u207A + NO\u2083\u207B \u2192 HNO\u2083");
        }
        else if (solute1.equals("Cu") && solute2.equals("Ag")){
            eg.setEquations("SO\u2084\u00B2\u207B + 2Ag\u207A \u2192 Ag\u2082SO\u2084",
                    "Cu\00B2\u207A + 2Ag\u207B \u2192 CuAg\u2082",
                    "Cu\00B2\u207A + 2NO\u2083\u207B \u2192 Cu*NO\u2083)\u2082");
        }
        else if (solute1.equals("Cu") && solute2.equals("Pb")){
            eg.setEquations("F\u207B + Pb\u00B2\u207A \u2192 PbF\u2082",
                    "Cu\u00B2\u207A + NO\u2083\u207B \u2192 Cu(NO\u2083)\u2082",
                    "F\u00B2\u207B + Pb\u00B2\u207A \u2192 PbF");
        }
        return eg;
    }
    
}
