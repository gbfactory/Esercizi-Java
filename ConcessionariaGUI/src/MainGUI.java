// Concessionaria by gb factory - 03/11/2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainGUI extends JFrame {

    JButton aggiungiAuto, visualizzaAuto;

    MainGUI() {
        super("Concessionaria");

        aggiungiAuto = new JButton("Aggiunti Automobile");
        aggiungiAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AggiungiGUI();
            }
        });

        visualizzaAuto = new JButton("Visualizza Concessionaria");
        visualizzaAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File concessionaria = new File("concessionaria.csv");

                if (concessionaria.exists()) {
                    new ElencoGUI();
                } else {
                    JOptionPane optionPane = new JOptionPane("Prima di visualizzare l'elenco devi inserire almeno un auto!", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Errore!");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    return;
                }
            }
        });

        setLayout(new FlowLayout());

        add(aggiungiAuto);
        add(visualizzaAuto);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        setResizable(false);
    }

}
