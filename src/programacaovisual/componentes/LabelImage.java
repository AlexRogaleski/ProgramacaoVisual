/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author alex
 */
public class LabelImage extends JFrame {

    public LabelImage() {
        // Criação de um icone a partir de uma imagem o parametro é o caminho do aquivo de imagem
        // troque pelo caminho da sua imagem
        Icon imagem = new ImageIcon("/home/alex/NetBeansProjects/JavaApplicationTeste/src/javaapplicationteste/components/logo.png");
        // Criação do JLabel (Texto, Icone, Orientação do texto)
        JLabel label = new JLabel("Imagem e texto",
                imagem, SwingConstants.LEFT);
        add(label);
        // Orientaçaõ horizontal do texto
        label.setHorizontalTextPosition
        (SwingConstants.CENTER);
        // Orientação vertical do texto
        label.setVerticalTextPosition
        (SwingConstants.BOTTOM);
        // exibe popup mensagem ao posicionar o mouse em cima do objeto
        label.setToolTipText
        ("Texto que aparece com o mouse sobre o label");

        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LabelImage();
    }

}
