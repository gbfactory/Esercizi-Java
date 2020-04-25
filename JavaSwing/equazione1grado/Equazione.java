/**
 * Programma che risolve equazione di primo grado ax + b = 0
 *
 * Classe equazione con il Frame
 *
 * @author gbfactory
 * @since 25 04 2020
 */

package equazione1grado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Equazione extends JFrame implements ActionListener {

    private JLabel labelTitolo;

    private JPanel panelA;
    private JPanel panelB;

    private JLabel labelA;
    private JLabel labelB;

    private JTextField fieldA;
    private JTextField fieldB;

    private JButton buttonCalc;

    private JTextField fieldRisultato;

    public Equazione() {

        super("Equazione di primo grado");

        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        // Titolo
        labelTitolo = new JLabel("Equazione di primo grado a * x + b = 0");
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 0;
        add(labelTitolo, c);

        // Panel A
        panelA = new JPanel();

        labelA = new JLabel("Inserisci A");

        fieldA = new JTextField();
        fieldA.setColumns(10);

        panelA.add(labelA);
        panelA.add(fieldA);

        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 1;
        add(panelA, c);

        // Panel B
        panelB = new JPanel();

        labelB = new JLabel("Inserisci B");

        fieldB = new JTextField();
        fieldB.setColumns(10);

        panelB.add(labelB);
        panelB.add(fieldB);

        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 1;
        add(panelB, c);

        // Button calcola
        buttonCalc = new JButton("Calcola");
        buttonCalc.addActionListener(this);
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;
        add(buttonCalc, c);

        // Risultato
        fieldRisultato = new JTextField("");
        fieldRisultato.setEditable(false);
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 4;
        add(fieldRisultato, c);

        // Finestra
        setSize(500, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String textA = fieldA.getText();
        String textB = fieldB.getText();

        if (textA == null || textB == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Inserisci i valori!");
            return;
        }

        double valA = 0, valB = 0;

        try {
            valA = Double.parseDouble(textA);
        } catch (NumberFormatException ea) {
            JOptionPane.showMessageDialog(new JFrame(), "A deve essere un numero!");
            return;
        }
        try {
            valB = Double.parseDouble(textB);
        } catch (NumberFormatException eb) {
            JOptionPane.showMessageDialog(new JFrame(), "B deve essere un numero!");
            return;
        }

        //labelTitolo.setText("Equazione di primo grado " + valA + " * x + " + valB + " = 0");

        if (valA == 0 && valB != 0) {
            fieldRisultato.setText("Impossibile");
        } else if (valA == 0 && valB == 0) {
            fieldRisultato.setText("Indeterminata");
        } else if (valA != 0 && valB != 0) {
            double valX = - valB / valA;
            DecimalFormat df = new DecimalFormat("#.00");
            String roundedVal = df.format(valX);
            fieldRisultato.setText(roundedVal);
            /*String textX = Double.toString(valX);
            fieldRisultato.setText(textX);*/
        }

    }
}
