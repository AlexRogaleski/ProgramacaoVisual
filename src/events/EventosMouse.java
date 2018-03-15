/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author alex
 */
public class EventosMouse extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel statusbar;

    public EventosMouse() {
        super("Demonstrando eventos do MOUSE");
        statusbar = new JLabel();
        getContentPane().add(statusbar, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(300, 300);
    }

    public void mouseClicked(MouseEvent e) {
        statusbar.setText("Clicou em [" + e.getX() + ", " + e.getY() + "]");
    }

    public void mousePressed(MouseEvent e) {
        statusbar.setText("Pressionou em [" + e.getX() + ", " + e.getY() + "]");
    }

    public void mouseReleased(MouseEvent e) {
        statusbar.setText("Soltou em [" + e.getX() + ", " + e.getY() + "]");
    }

    public void mouseEntered(MouseEvent e) {
        statusbar.setText("Mouse na Janela");
    }

    public void mouseExited(MouseEvent e) {
        statusbar.setText("Mouse saiu da Janela");
    }

    public void mouseDragged(MouseEvent e) {
        statusbar.setText("Arrastado em [" + e.getX() + ", " + e.getY() + "]");
    }

    public void mouseMoved(MouseEvent e) {
        statusbar.setText("Movido em [" + e.getX() + ", " + e.getY() + "]");
    }

    public static void main(String args[]) {
        EventosMouse app = new EventosMouse();
        app.setVisible(true);
    }
}
