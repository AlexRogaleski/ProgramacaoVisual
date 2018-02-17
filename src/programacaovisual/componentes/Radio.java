/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author alex
 */
public class Radio extends JFrame{
    // Cria dois botões RadioButtoun
    JRadioButton radio = new JRadioButton("Masculino", true);
    JRadioButton radio2 = new JRadioButton("Feminino");
    
    // Cria um grupo de botões
    ButtonGroup grupo = new ButtonGroup();

    public Radio() {
        // Define Gerenciador de Layout
        setLayout(new FlowLayout());    
        
        // Adiciona os botões ao JFrame
        add(radio);
        add(radio2);
        
        // Adiciona os botões ao grupo para que se possa marcar apenas um deles de cada vez
        grupo.add(radio);
        grupo.add(radio2);
        
        setTitle("Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Radio();
    }
}
