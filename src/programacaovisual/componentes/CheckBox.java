/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class CheckBox extends JFrame{
    /*
    Cria um novo CheckBox(String nome, Boolean marcado/não marcado)
    */
    JCheckBox box = new JCheckBox("OP", true);

    public CheckBox() {
        // Define o Layout para FlowLayout
        setLayout(new FlowLayout());    
        
        // Adiciona o CheckBox ou JFrame
        add(box);
        // Define um novo texto para o botão
        box.setText("Opção 1");
        /*Captura a propriedade do que diz se ele esta ou 
        não selecionado e imprime no terminal*/
        System.out.println(box.isSelected());
        
        setTitle("Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new CheckBox();
    }
}
