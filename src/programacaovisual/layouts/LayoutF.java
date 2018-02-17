/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class LayoutF extends JFrame{
    
    JButton btn1 = new JButton("Botão 1");
    JButton btn2 = new JButton("Botão 2");
    public LayoutF() {
        // Define o Gerenciador de layout do frame para FlowLayout
        setLayout(new FlowLayout());
        
        // Define para FlowLayout ordenando os components para direita
        //setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        // Define para FlowLayout ordenando os components para esquerda
        //setLayout(new FlowLayout(FlowLayout.LEFT));
        add(btn1);
        add(btn2);
        
        // Titulo do Frame
        setTitle("Janela");
        // Tamanho do frame setSize(altura, largura)
        setSize(500,400);
        // Adiciona um operador o close do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adiciona uma posição para a janela, null para centralizar
        setLocationRelativeTo(null);
        /* 
        Redimencionavel, true para que o ususario possa redimencionar 
        a janela e false para que não possa
        */
        setResizable(false);
        // Faz com que o Frame seja visivel ou não
        setVisible(true);
    }
    
    public static void main(String[] args){
        new LayoutF();
    }
}
