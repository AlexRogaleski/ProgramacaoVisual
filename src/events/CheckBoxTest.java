/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame {

    private JCheckBox bold, italic;
    private JTextField t;

    public CheckBoxTest() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        bold = new JCheckBox("Bold");
        italic = new JCheckBox("Italic");
        add(bold);
        add(italic);
        t = new JTextField("Toque o estilo da fonte", 20);
        t.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        add(t);
        CheckBoxHandler handler = new CheckBoxHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String args[]) {
        CheckBoxTest app = new CheckBoxTest();
    }

    private class CheckBoxHandler implements ItemListener {

        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == bold) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valBold = Font.BOLD;
                } else {
                    valBold = Font.PLAIN;
                }
            }
            if (e.getSource() == italic) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valItalic = Font.ITALIC;
                } else {
                    valItalic = Font.PLAIN;
                }
            }
            t.setFont(new Font("TimesRoman", valBold + valItalic, 14));
        }
    }
}
