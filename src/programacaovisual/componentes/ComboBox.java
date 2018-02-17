/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class ComboBox extends JFrame{
    /*
    Cria um novo ComboBox
    a trecho <String> informa de que classe ele extende,
    que tipo de informação esse ComboBox ira receber, 
    se as informações incluidas fossem números poderiamos
    usar <Integer> por exemplo.    
    */
    JComboBox<String> combo = new JComboBox<String>();
            
    public ComboBox() {
        // Define Gerenciador de Layout
        setLayout(new FlowLayout());   
        // Adiciona ComboBox ou JFrame
        add(combo);
        // Adiciona opçõs dentro do ComboBox
        combo.addItem("Programação Visual");
        combo.addItem("Banco de Dados");
        // Define a opção pré selecionada dia indice
        combo.setSelectedIndex(1);
        // Define a opção pré selecionada via nome
        combo.setSelectedItem("Programação Visual");
        
        // Imprime informações no terminal:
        // captura o indice do item selecionado;
        System.out.println(combo.getSelectedIndex());
        // captura o objeto selecionado, e captura seu valor.
        System.out.println(String.valueOf(combo.getSelectedItem()));
        
        
        setTitle("Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new ComboBox();
    }
}
