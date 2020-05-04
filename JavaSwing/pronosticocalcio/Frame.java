package pronosticocalcio;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Pronostico di calcio
 *
 * Frame dell'applicazione
 *
 * @author gbfactory
 * @date 04/05/2020
 */

public class Frame extends JFrame implements ActionListener {

    private JTextField fieldSquadra1;
    private JTextField fieldSquadra2;

    private JButton btnWin1;
    private JButton btnWin2;
    private JButton btnDraw;

    private int userClick = 0;

    public Frame() {

        super("Pronostico Calcio");

        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        // Inserimento 1
        fieldSquadra1 = new JTextField();
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 0;
        add(fieldSquadra1, c);

        // Inserimento 2
        fieldSquadra2 = new JTextField();
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 0;
        add(fieldSquadra2, c);

        // Bottone WIN 1
        btnWin1 = new JButton("0");
        btnWin1.addActionListener(this);
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 1;
        add(btnWin1, c);

        // Button PAREGGIO
        btnDraw = new JButton("X");
        btnDraw.addActionListener(this);
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 1;
        add(btnDraw, c);

        // Bottone WIN 2
        btnWin2 = new JButton("1");
        btnWin2.addActionListener(this);
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 1;
        add(btnWin2, c);

        // Finestea
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void disableSquadre() {
        fieldSquadra1.setEnabled(false);
        fieldSquadra2.setEnabled(false);
    }

    public void disableButtons(JButton selected) {
        if (selected == btnWin1) {
            btnWin2.setEnabled(false);
            btnDraw.setEnabled(false);
        } else if (selected == btnWin2) {
            btnWin1.setEnabled(false);
            btnDraw.setEnabled(false);
        } else if (selected == btnDraw) {
            btnWin1.setEnabled(false);
            btnWin2.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton) e.getSource();

        String squadra1 = fieldSquadra1.getText();
        String squadra2 = fieldSquadra2.getText();

        if (squadra1.isEmpty() || squadra2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inserisci le squadre!");
            return;
        }

        // Imposta scelta utente
        if (clicked == btnWin1) {
            userClick = 1;
            disableSquadre();
            disableButtons(btnWin1);
            System.out.println(userClick);
        } else if (clicked == btnWin2) {
            userClick = 2;
            disableSquadre();
            disableButtons(btnWin2);
            System.out.println(userClick);
        } else if (clicked == btnDraw) {
            userClick = 3;
            disableSquadre();
            disableButtons(btnDraw);
            System.out.println(userClick);
        }

    }
}
