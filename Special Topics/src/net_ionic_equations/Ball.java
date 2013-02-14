/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net_ionic_equations;
import processing.core.*;
import javax.swing.JLabel;
/**
 *
 * @author roxas_000
 */
class Ball extends PApplet
{
    float x,y,r,m;
    Ball()
    {
        
    }
    public Ball(float x,float y,float r)
    {
        this.x=x;
        this.y = y;
        this.r = r;
        m = (float) (r*.1);
    }
}
