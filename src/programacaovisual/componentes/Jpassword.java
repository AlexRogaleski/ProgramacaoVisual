/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual.componentes;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

/**
 *
 * @author alex
 */
public class Jpassword extends JFrame{

    //Cria um novo Label
    JLabel lbl = new JLabel("Senha:");
    //Cria um novo JPasswordField
    JPasswordField pass = new JPasswordField(20);

    public Jpassword() {

        // Alinha o label ao centro Horizontalmente
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        // Adiciona o label ao JFrame
        add(lbl);
        
        //Adiciona texto padão ao JPasswordField
        pass.setText("Teste");
        
        // Adiciona o JPasswordField ao JFrame
        add(pass);
        
        setTitle("Janela");
        setLayout(new FlowLayout());
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Jpassword();
    }
}
