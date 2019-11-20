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

/**
 *
 * @author ilkac
 */
public class ColorTextPanel extends javax.swing.JPanel implements ActionListener {

    public ColorTextPanel() {
        initComponents();
        cTextFieldRed.addActionListener(this);
        cTextFieldGreen.addActionListener(this);
        cTextFieldBlue.addActionListener(this);
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
        cTextFieldGreen = new colorchoosercomponents.ColorTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cTextFieldBlue = new colorchoosercomponents.ColorTextField();

        setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setText("Red");
        add(jLabel1);

        cTextFieldRed.setText("0");
        add(cTextFieldRed);
        add(jLabel4);
        add(jLabel5);

        jLabel2.setText("Green");
        add(jLabel2);

        cTextFieldGreen.setText("0");
        cTextFieldGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTextFieldGreenActionPerformed(evt);
            }
        });
        add(cTextFieldGreen);
        add(jLabel6);
        add(jLabel7);

        jLabel3.setText("Blue");
        add(jLabel3);

        cTextFieldBlue.setText("0");
        add(cTextFieldBlue);
    }// </editor-fold>//GEN-END:initComponents

    private void cTextFieldGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTextFieldGreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTextFieldGreenActionPerformed


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

    public void setColorTextPanel(Color color) {
        cTextFieldRed.setText(String.valueOf(color.getRed()));
        cTextFieldGreen.setText(String.valueOf(color.getGreen()));
        cTextFieldBlue.setText(String.valueOf(color.getBlue()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = parseInt(cTextFieldRed.getText());
        int g = parseInt(cTextFieldGreen.getText());
        int b = parseInt(cTextFieldBlue.getText());
        Color color = new Color(r, g, b);
        ColorEvent colorEvent = new ColorEvent(this, color);
        ColorEventHandler.fireColorEvent(colorEvent);
    }

}
