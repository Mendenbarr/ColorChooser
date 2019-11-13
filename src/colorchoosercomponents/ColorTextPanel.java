/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author ilkac
 */
public class ColorTextPanel extends javax.swing.JPanel implements ActionListener {

    private ArrayList<ColorListener> listeners;
    //private Vector listeners;
    /**
     * Creates new form ColorTextPanel
     */
    public ColorTextPanel() {
        initComponents();
        cTextFieldRed.addActionListener(this);
        cTextFieldGreen.addActionListener(this);
        cTextFieldBlue.addActionListener(this);
        //listeners = new Vector();
        listeners = new ArrayList<>();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cTextFieldRed = new colorchoosercomponents.ColorTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cTextFieldBlue = new colorchoosercomponents.ColorTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cTextFieldGreen = new colorchoosercomponents.ColorTextField();

        setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setText("Red");
        add(jLabel1);

        cTextFieldRed.setText("0");
        add(cTextFieldRed);
        add(jLabel4);
        add(jLabel5);

        jLabel2.setText("Green");
        add(jLabel2);

        cTextFieldBlue.setText("0");
        add(cTextFieldBlue);
        add(jLabel6);
        add(jLabel7);

        jLabel3.setText("Blue");
        add(jLabel3);

        cTextFieldGreen.setText("0");
        add(cTextFieldGreen);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colorchoosercomponents.ColorTextField cTextFieldBlue;
    private colorchoosercomponents.ColorTextField cTextFieldGreen;
    private colorchoosercomponents.ColorTextField cTextFieldRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    
    private void fireColorEvent(ColorEvent ce){
       ArrayList list;
       //even though Vector is thread-safe, we need to use synchronized to ensure thread-safe anyway.
       synchronized(this) {
           list = (ArrayList)listeners.clone();
       }
       //gives all the members in the collection
       int size = list.size();
       for(int i=0; i<size; i++) {
           //elementAt takes the position in the vector (ArrayList).
           ColorListener colorListener = (ColorListener)listeners.get(i);
           colorListener.changeColor(ce);
       }
       
    }
    
    public void addColorListener(ColorListener colorListener) {
        //not specifying the order because we don't need to
        listeners.add(colorListener);
    }
    
    public void removeColorListener(ColorListener colorListener) {
        //again not specifying the order cuz we don't need to
        listeners.remove(colorListener);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int r = parseInt(cTextFieldRed.getText());
        int g = parseInt(cTextFieldGreen.getText());
        int b = parseInt(cTextFieldGreen.getText());
        Color color = new Color(r,g,b);
        ColorEvent colorEvent = new ColorEvent(this,color);
        fireColorEvent(colorEvent);
    }
}
