/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avacados;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author rogal
 */
public class jLIst extends JFrame{
    private JList list;
    private static String[] corNomes = {"preto", "branco", "vermelho", "verde", "azul"};
    private static Color[] cores = {Color.BLACK, Color.WHITE, Color.RED, Color.GREEN, Color.BLUE};
    
    Vector<Class<?>> superClasses = new Vector<Class<?>>();  
    Class<JList> rootClass = javax.swing.JList.class;  
	
    
    public jLIst(){
        super("Cores");
        setLayout(new FlowLayout());
        for(Class<?> cls = rootClass; cls != null; cls = cls.getSuperclass()) {      				superClasses.addElement(cls);  
	}  
	JList<Class<?>> myList = new JList<Class<?>>(superClasses);
        add(new JScrollPane(myList));
        
        list = new JList(corNomes);
        list.setVisibleRowCount(1);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));
        
        list.addListSelectionListener(
            new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event) {
                    getContentPane().setBackground(cores[list.getSelectedIndex()]);
                }
        });
        
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);        
    }
    
    public static void main(String[] args){
        new jLIst();
    }
    
    
}
