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

    public ColorLabel() {
        super();
        //setText("R: 0 G: 0 B: 0");  
        setText("Hex:  #000000");
    }

    @Override
    public void changeColor(ColorEvent ce) {
        setText("Hex:  #" + toHex(ce.getColor().getRed()) + toHex(ce.getColor().getGreen()) + toHex(ce.getColor().getBlue()));
        //setText("R: " + ce.getColor().getRed() + " G: " + ce.getColor().getGreen() + " B: " + ce.getColor().getBlue());
    }

    public static String toHex(int decimal) {
        int remainder;
        String hex = "";
        char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if (decimal == 0){
            hex = "00";
        } else if (0 < decimal && decimal < 16){
            remainder = decimal % 16;
            hex = "0" + hexchars[remainder];
        } else if (decimal >= 16){
        while (decimal > 0) {
            remainder = decimal % 16;
            hex = hexchars[remainder] + hex;
            decimal = decimal / 16;
        }
        }
        return hex;
    }

}
