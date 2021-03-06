/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avacados;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author rogal
 */
public class jTextPane extends javax.swing.JFrame {

    
    private Boolean bold = false;
    private Boolean italic = false;
    private Boolean underline = false;
    private SimpleAttributeSet att = new SimpleAttributeSet();
    /**
     * Creates new form jTextPane
     */
    public jTextPane() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        negrito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        italico = new javax.swing.JButton();
        sublinhado = new javax.swing.JButton();
        titulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        negrito.setText("Negrito");
        negrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(texto);

        italico.setText("Itálico");
        italico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicoActionPerformed(evt);
            }
        });

        sublinhado.setText("Sublinhado");
        sublinhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sublinhadoActionPerformed(evt);
            }
        });

        titulo.setText("Titulo");
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(negrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(italico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sublinhado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addGap(0, 110, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negrito)
                    .addComponent(italico)
                    .addComponent(sublinhado)
                    .addComponent(titulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void negritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negritoActionPerformed
        int end = texto.getSelectionEnd();
        int start = texto.getSelectionStart();
        int count = texto.getSelectedText().length();
        String selecao = texto.getSelectedText();
        
        if(bold == false){
            StyleConstants.setBold(att, true);
            bold = true;
        }else{
            StyleConstants.setBold(att, false);
            bold = false;
        }
        
        StyleConstants.setFontFamily(att, "Arial");
        StyleConstants.setFontSize(att, 13);
        try {
            texto.getStyledDocument().remove(start,count);
            texto.getStyledDocument().insertString(start,selecao , att);
            texto.select(start, end);
//            texto.getStyledDocument().insertString(texto.getStyledDocument().getLength(), texto.getText(), att);
        } catch (BadLocationException ex) {
            Logger.getLogger(jTextPane.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_negritoActionPerformed

    private void italicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicoActionPerformed
        int end = texto.getSelectionEnd();
        int start = texto.getSelectionStart();
        int count = texto.getSelectedText().length();
        String selecao = texto.getSelectedText();
        
        if(italic == false){
            StyleConstants.setItalic(att, true);
            italic = true;
        }else{
            StyleConstants.setItalic(att, false);
            italic = false;
        }
        try {
            texto.getStyledDocument().remove(start,count);
            texto.getStyledDocument().insertString(start,selecao , att);
            texto.select(start, end);
//            texto.getStyledDocument().insertString(texto.getStyledDocument().getLength(), texto.getText(), att);
        } catch (BadLocationException ex) {
            Logger.getLogger(jTextPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_italicoActionPerformed

    private void sublinhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sublinhadoActionPerformed
        int end = texto.getSelectionEnd();
        int start = texto.getSelectionStart();
        int count = texto.getSelectedText().length();
        String selecao = texto.getSelectedText();

        if(underline == false){
            StyleConstants.setUnderline(att, true);
            underline = true;
        }else{
            StyleConstants.setUnderline(att, false);
            underline = false;
        }
        
        try {
            texto.getStyledDocument().remove(start,count);
            texto.getStyledDocument().insertString(start,selecao , att);
            texto.select(start, end);
//            texto.getStyledDocument().insertString(texto.getStyledDocument().getLength(), texto.getText(), att);
        } catch (BadLocationException ex) {
            Logger.getLogger(jTextPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sublinhadoActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        int end = texto.getSelectionEnd();
        int start = texto.getSelectionStart();
        int count = texto.getSelectedText().length();
        String selecao = texto.getSelectedText();
        
        StyleConstants.setFontFamily(att, "Times New Roman");
        StyleConstants.setForeground(att,Color.BLUE);
        StyleConstants.setFontSize(att, 30);  
        
        try {
            texto.getStyledDocument().remove(start,count);
            texto.getStyledDocument().insertString(start,selecao , att);
            texto.select(start, end);
            StyleConstants.setFontFamily(att, "Arial");
            StyleConstants.setForeground(att,Color.BLACK);
            StyleConstants.setFontSize(att, 13);  
//            texto.getStyledDocument().insertString(texto.getStyledDocument().getLength(), texto.getText(), att);
        } catch (BadLocationException ex) {
            Logger.getLogger(jTextPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tituloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jTextPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jTextPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jTextPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jTextPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jTextPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton italico;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton negrito;
    private javax.swing.JButton sublinhado;
    private javax.swing.JTextPane texto;
    private javax.swing.JButton titulo;
    // End of variables declaration//GEN-END:variables
}
