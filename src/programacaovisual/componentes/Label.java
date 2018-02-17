/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author alex
 */
public class Label extends JFrame{
    // Cria um tipo de fonte
    Font grande = new Font("Arial", Font.BOLD, 50);
    //Cria um novo Label
    JLabel lbl = new JLabel("Label 1");

    public Label() {
        // Define uma fonte para o label
        lbl.setFont(grande);
        // Define um novo texto para o label
        lbl.setText("Nome:");
        // Alinha o label ao centro Horizontalmente
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        // Adiciona o label ao JFrame
        add(lbl);
        
        setTitle("Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Label();
    }
}
