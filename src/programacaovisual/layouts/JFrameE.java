/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author alex
 */
/*
Aqui o frame não precisou ser criado manualmente, 
ele a classe esta sendo extendidade de JFrame
*/
public class JFrameE extends JFrame{
    JLabel label = new JLabel("Teste");
    JLabel label2 = new JLabel("Teste 2");
    JButton btn = new JButton("Salvar");
    JCheckBox box = new JCheckBox();
    JRadioButton rd1 = new JRadioButton("Masculino",true);
    JRadioButton rd2 = new JRadioButton("Feminino");
    ButtonGroup grupo = new ButtonGroup();
    public JFrameE() {
        setLayout(new GridLayout(2,3));
        label.setText("Novo Nome");
        add(label);
        add(label2);
        add(btn);
        box.setText("teste");
        box.setSelected(true);
        add(box);
        grupo.add(rd1);
        grupo.add(rd2);
        add(rd1);
        add(rd2);
        //Linhas referentes ao gernciador padrao, border layout
//        add(BorderLayout.NORTH, label2);
//        add(BorderLayout.SOUTH, btn);
        
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
        new JFrameE();
    }
}
