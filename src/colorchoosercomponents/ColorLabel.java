/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import javax.swing.JLabel;

/**
 *
 * @author 00220682
 */
public class ColorLabel extends JLabel implements ColorListener {
    
    public ColorLabel(){
        super();
        setText("R: 0 G: 0 B: 0");
    }

    @Override
    public void changeColor(ColorEvent ce) {
        setText("R: " + ce.getColor().getRed() + " G: " + ce.getColor().getGreen() + " B: " + ce.getColor().getBlue());
    }
    
}
