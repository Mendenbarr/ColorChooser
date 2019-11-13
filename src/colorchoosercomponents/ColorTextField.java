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

    public ColorTextField() {
        super();
        
    }

    @Override
    public void changeColor(ColorEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
