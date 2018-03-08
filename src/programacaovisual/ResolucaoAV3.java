/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovisual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author alex
 */
public class ResolucaoAV3 extends JFrame {
    // Criação dos JLabels
    JLabel jlAgencia = new JLabel("Código da Agência:");
    JLabel jlConta = new JLabel("Número da Conta:");
    JLabel jlNome = new JLabel("Nome");
    JLabel jlEndereco = new JLabel("Endereço");
    JLabel jlTelefone = new JLabel("Telefone");
    JLabel jlCpf = new JLabel("CPF");
    
    //Criação dos JTextFields
    JTextField jtfAgencia = new JTextField(5);    
    JTextField jtfConta = new JTextField(5);
    JTextField jtfNome = new JTextField(30);    
    JTextField jtfEndereco = new JTextField(30);    
    JTextField jtfTelefone = new JTextField(30);    
    JTextField jtfCpf = new JTextField(30);
    
    // Criação dos paineis
    JPanel jpHeader = new JPanel();
    JPanel jpBody = new JPanel();
    JPanel jpBody2 = new JPanel();
    JPanel jpBody3 = new JPanel();
    JPanel jpFooter = new JPanel();

    // Criação dos separadores
    JSeparator jSeparator01 = new JSeparator();
    JSeparator jSeparator02 = new JSeparator();
    
    // Criação dos botoes
    JRadioButton jrbCorrente = new JRadioButton("Conta Corrente");
    JRadioButton jrbPoupanca = new JRadioButton("Conta Poupança");
    ButtonGroup bgContas = new ButtonGroup();
    JButton jbConsultar = new JButton("Consultar");
    JButton jbAtualizar = new JButton("Atualizar");
    JButton jbFecchar = new JButton("Fechar");

    
    // Criação do componente Box para usar o BoxLayout
    Box box = Box.createHorizontalBox();
    
    private ResolucaoAV3() {
        setTitle("Programação Visual");
        // Frame usa BorderLayout
        setLayout(new BorderLayout());
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();
        setResizable(false);

        // Painel Header ira ficar no NORTE do frame
        jpHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
        jpHeader.add(jlAgencia);
        jpHeader.add(jtfAgencia);
        jpHeader.add(jlConta);
        jpHeader.add(jtfConta);
        add(jpHeader, BorderLayout.NORTH);

        // Painel Body ira ficar no CENTRO do Frame
        jpBody.setLayout(new BorderLayout());
        // Separados01 ficara no NORTE do painel Body
        jpBody.add(jSeparator01, BorderLayout.NORTH);
        
        // Painel Body2 ficara no CENTRO do Body
        jpBody2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpBody2.setBackground(Color.red);
        jpBody2.add(jlNome);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        jpBody2.add(jtfNome);
        jpBody2.add(jlEndereco);
        jpBody2.add(jtfEndereco);
        jpBody2.add(jlTelefone);
        jpBody2.add(jtfTelefone);
        jpBody2.add(jlCpf);
        jpBody2.add(jtfCpf);        
   
        jrbCorrente.setSelected(true);
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);
        // Criação de uma Struct do Box para dar espaçamento e centralizar a box
        box.add(Box.createHorizontalStrut(80));
        box.add(jrbCorrente);
        box.add(jrbPoupanca);
        box.add(Box.createHorizontalStrut(80));
        jpBody2.add(box);
        
        jpBody.add(jpBody2, BorderLayout.CENTER);
        // Separados02 ficara no SUL da painel Body
        jpBody.add(jSeparator02, BorderLayout.SOUTH);
        add(jpBody);

        // Painel Footer ficara no SUL do JFrame
        jpFooter.setLayout(new FlowLayout());
        jpFooter.add(jbConsultar);
        jbAtualizar.setEnabled(false);
        jpFooter.add(jbAtualizar);
        jpFooter.add(jbFecchar);
        add(jpFooter, BorderLayout.SOUTH);

    }

    private void centralizar() {
        // Captura as dimenções da tela
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // Captura dimenções da janela (JFrame)
        Dimension janela = getSize();
        
        //Se a altura da janela for maio que a altura da tela define a altura da janela igual a altura da tela
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        
        //Se a largura da janela for maio que a largura da tela define a largura da janela igual a largura da tela
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        
        // faz calculo proporcional e define a localização da janela
        setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }

    public static void main(String args[]) {
        ResolucaoAV3 janela = new ResolucaoAV3();
        janela.setVisible(true);
        //new Janela();
    }

}
