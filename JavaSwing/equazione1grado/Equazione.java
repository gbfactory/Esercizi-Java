/**
 * Programma che risolve l'equazione ax + b = 0 dando il valore di x
 *
 * @author gbfactory
 * @since 20 04 2020
 */

package equazione1grado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Equazione extends JFrame {

    private JTextField a;
    private JTextField b;
    private JTextField risultato;
    private JButton calcola;

    public Equazione() {

        super("Equazione di primo grado");

        setLayout(new FlowLayout());

        a = new JTextField();
        a.setColumns(3);

        b = new JTextField();
        b.setColumns(3);

        risultato = new JTextField();
        risultato.setColumns(10);

        calcola = new JButton("Calcola");

        calcola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textA = a.getText();
                String textB = b.getText();

                if (textA == null || textB == null) {
                    JOptionPane.showMessageDialog(new JFrame(), "Inserisci i valori!");
                    return;
                }

                double valA = 0, valB = 0;

                try {
                    valA = Double.parseDouble(a.getText());
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(new JFrame(), "A deve essere un numero!");
                    return;
                }
                try {
                    valB = Double.parseDouble(b.getText());
                } catch (NumberFormatException eb) {
                    JOptionPane.showMessageDialog(new JFrame(), "B deve essere un numero!");
                    return;
                }

                if (valA == 0 && valB != 0) {
                    risultato.setText("Impossibile");
                } else if (valA == 0 && valB == 0) {
                    risultato.setText("Indeterminata");
                } else if (valA != 0 && valB != 0) {
                    double valX = - valB / valA;
                    String textX = Double.toString(valX);
                    risultato.setText(textX);
                }

            }
        });

        add(a);
        add(b);
        add(calcola);
        add(risultato);

        setSize(500, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }



}
