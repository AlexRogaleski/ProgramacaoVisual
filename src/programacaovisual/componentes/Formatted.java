/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import java.awt.Image;
import java.text.ParseException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author alex
 */
public class Formatted extends JFrame {

    public Formatted() {
        // Cria mascaras com valor nulo
        MaskFormatter mascaraCep = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;
        
        // Adiciona os formatos de mascara nas variaveis criadas acima
        try {
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCep.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + 
                    excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextCep = 
                new JFormattedTextField(mascaraCep);
        JFormattedTextField jFormattedTextTel = 
                new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = 
                new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = 
                new JFormattedTextField(mascaraData);
        // adiciona objetos no JFrame
        add(jFormattedTextCep);
        add(jFormattedTextTel);
        add(jFormattedTextCpf);
        add(jFormattedTextData);
        
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Formatted();
    }

}
