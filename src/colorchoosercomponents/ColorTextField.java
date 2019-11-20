/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import colorfield.JColorField;

/**
 *
 * @author 01048750
 */
public class ColorTextField extends JColorField implements ColorListener{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorTextField() {
        super();
        this.setText("0");
    }
    
    @Override
    public void changeColor(ColorEvent ce) {
        if (color == "red") setText(Integer.toString(ce.getColor().getRed()));
        else if (color == "green") setText(Integer.toString(ce.getColor().getGreen()));
        else if (color == "blue") setText(Integer.toString(ce.getColor().getBlue()));
    }
}
