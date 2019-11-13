/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorfield;

/**
 *
 * @author 00220682
 */
public class JColorField extends JRegExpField {
    public JColorField(){
        super();
        setExp("[0-2]?[0-5]?[0-5]?");
    }
    
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
}
