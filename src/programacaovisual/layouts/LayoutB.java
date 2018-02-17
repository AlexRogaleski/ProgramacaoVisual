/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class LayoutB extends JFrame{
    
    JButton btnN = new JButton("Botão Norte");
    JButton btnS = new JButton("Botão Sul");
    JButton btnL = new JButton("Botão Leste");
    JButton btnO = new JButton("Botão Oeste");
    JButton btnC = new JButton("Botão Centro");
    public LayoutB() {
        /*
        Define o Gerenciador de Layout para BorderLayout, porem nesse caso
        não seria necessário pois o gerenciador padrão do JFrame 
        ja é BorderLayout
        */
        setLayout(new BorderLayout()); // Padrão do JFrame
        
        /*
        Adiciona os Botões respectivamente nas posições:
        Norte, Sul, Leste, Oeste e centro ja janela
        */
        add(BorderLayout.NORTH, btnN);
        add(BorderLayout.SOUTH, btnS);
        add(BorderLayout.EAST, btnL);
        add(BorderLayout.WEST, btnO);
        add(BorderLayout.CENTER, btnC);
        
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
        new LayoutB();
    }
}
