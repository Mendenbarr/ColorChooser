/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import javax.swing.JTextField;

/**
 *
 * @author 01048750
 */
public class ColorTextField extends JTextField implements ColorListener{
    public String color;

    public ColorTextField() {
        super();
        setText("0");
        
    }

    @Override
    public void changeColor(ColorEvent ce) {
        System.out.println("Test");
        if (color == "red") setText(Integer.toString(ce.getColor().getRed()));
        else if (color == "green") setText(Integer.toString(ce.getColor().getGreen()));
        else if (color == "blue") setText(Integer.toString(ce.getColor().getBlue()));
    }
    
}
