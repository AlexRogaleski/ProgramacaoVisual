/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.layouts;

import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class JFrameC {
    public JFrameC() {
        // Frame foi criado como um componente
        JFrame jf = new JFrame();
        jf.setTitle("Janela");
        jf.setSize(500,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setVisible(true);
    }
    
    public static void main(String[] args){
        new JFrameC();
    }
}
