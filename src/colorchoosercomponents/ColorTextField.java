/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import colorfield.JRegExpField;

/**
 *
 * @author 01048750
 */
public class ColorTextField extends JRegExpField implements ColorListener{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorTextField() {
        super();
        setText("0");
        setExp("\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b");
        
    }

    @Override
    public void changeColor(ColorEvent ce) {
        if (color == "red") setText(Integer.toString(ce.getColor().getRed()));
        else if (color == "green") setText(Integer.toString(ce.getColor().getGreen()));
        else if (color == "blue") setText(Integer.toString(ce.getColor().getBlue()));
    }
}
