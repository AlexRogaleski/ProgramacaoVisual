/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.layouts;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class LayoutG extends JFrame{
    // Criação dos botões
    JButton btn1 = new JButton("Botão 1");
    JButton btn2 = new JButton("Botão 2");
    JButton btn3 = new JButton("Botão 3");
    JButton btn4 = new JButton("Botão 4");
    
    public LayoutG() {
        // Define um gerenciador de layout do Frame para GridLayout(int linhas, int colunas)
        setLayout(new GridLayout(2, 2));
        // Adição dos botóes ao Frame
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        
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
        new LayoutG();
    }
}
