/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class TextField extends JFrame{
    // Cria um novo TextField(int tamanho)
    JTextField caixa = new JTextField(30);

    public TextField() {
        // Define gerenciador de layout
        setLayout(new FlowLayout());    
        
        // Adiciona Caixa de texto ao JFrame
        add(caixa);
        // Define um texto para caixa de texto
        caixa.setText("Texto");
        
        setTitle("Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new TextField();
    }
}
