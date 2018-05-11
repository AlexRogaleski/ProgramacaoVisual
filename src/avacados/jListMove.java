/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avacados;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rogal
 */
public class jListMove extends JFrame{
    private JList esquerda;
    private JList direita;
    private JButton mover;
    private JButton limpar;
    

    private static String[] cursos = {"Administração", "Agronogócio", "Contabilidade", "Direito", "Sistemas"};
    
    public jListMove(){
        super("Troca");
        setLayout(new FlowLayout());
        
        esquerda = new JList(cursos);
        esquerda.setVisibleRowCount(3);
        esquerda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(esquerda));
        
        mover = new JButton("Mover ->");
        mover.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    direita.setListData(esquerda.getSelectedValues());
                }
            });
        add(mover);
        String[] data = {};
        limpar = new JButton("Limpar");
        limpar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    direita.setListData(data);
                }
            });
        add(limpar);
        
        direita = new JList();
        direita.setVisibleRowCount(3);
        direita.setFixedCellWidth(150);
        direita.setFixedCellHeight(20);
        direita.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(direita));
        
        
        setSize(500,400);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);        
    }
    
    public static void main(String[] args){
        new jListMove();
    }
}
