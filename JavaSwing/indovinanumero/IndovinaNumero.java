package indovinanumero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Programma Indovina Numero
 * Classe IndovinaNumero
 *
 * @author gbfactory
 * @date 25/04/2020
 */

public class IndovinaNumero extends JFrame implements ActionListener {

    //private JMenuBar menuBar;
    //private JMenu menu;
    //private JMenuItem settings;

    private JPanel panelInputNumber;

    private JLabel labelTitle;
    private JLabel labelAttempts;
    private JLabel labelPastAttempts;

    private JTextField fieldNumber;

    private JButton buttonTry;
    private JButton buttonPlay;
    private JButton buttonReset;

    private int random;
    private int attempts;
    private int maxAttempts = 5;
    private int tryNumb;

    /**
     * Gui principale del gioco IndovinaNumero
     */
    public IndovinaNumero() {

        super("Indovina Numero");

        // Menu Bar
        /*menuBar = new JMenuBar();

        menu = new JMenu("Menu");
        settings = new JMenuItem("Impostazioni");
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SettingsFrame(maxAttempts);
            }
        });

        setJMenuBar(menuBar);
        menu.add(settings);
        menuBar.add(menu);*/

        // Layout
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        // Titolo
        labelTitle = new JLabel("Genera un numero da 1 a 100 e prova ad indovinarlo!");
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 0;
        add(labelTitle, c);

        // Pannello prova numero
        panelInputNumber = new JPanel();
        panelInputNumber.setLayout(new BoxLayout(panelInputNumber, BoxLayout.PAGE_AXIS));

        fieldNumber = new JTextField();
        fieldNumber.setEditable(false);

        buttonTry = new JButton("TENTA");
        buttonTry.setEnabled(false);
        buttonTry.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonTry.addActionListener(this);

        panelInputNumber.add(fieldNumber);
        panelInputNumber.add(buttonTry);

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 1;
        add(panelInputNumber, c);

        // Tentativi
        labelAttempts = new JLabel("Tentativi: 0");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.CENTER;
        add(labelAttempts, c);

        // Tentativi precedenti
        labelPastAttempts = new JLabel("Tentativi Precedenti: ");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.CENTER;
        add(labelPastAttempts, c);

        // Play
        buttonPlay = new JButton("GIOCA");
        buttonPlay.addActionListener(this);
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 4;
        add(buttonPlay, c);

        // Finestra
        setSize(400, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    /**
     * Abilita il gioco
     *  - rende editabile il field per l'inserimento del numero
     *  - abilita il bottone per effettuare il tentativo
     */
    private void gameEnable() {
        fieldNumber.setEditable(true);
        buttonTry.setEnabled(true);
    }

    /**
     * Disabilita il gioco
     *  - rende non editabile il field per l'inserimento del numero
     *  - disabilita il bottone per effettuare il tentativo
     */
    private void gameDisable() {
        fieldNumber.setEditable(false);
        buttonTry.setEnabled(false);
    }

    /**
     * Imposta il numero di tentativi e aggiorna la label
     * Se il numero di tentativi passati = 0 resetta il label dei tentativi passati
     * @param attempts numero di tentativi
     */
    private void setAttempts(int attempts) {
        this.attempts = attempts;
        labelAttempts.setText("Tentativi: " + attempts);
        if (attempts == 0) {
            labelPastAttempts.setText("Tentativi passati: ");
        }
    }

    /**
     * Aggiorna il label dei tentativi passati appendendo il nuovo tentativo
     * @param attempt tentativo da appendere
     */
    private void addPastAttempt(int attempt) {
        labelPastAttempts.setText(labelPastAttempts.getText() + attempt + ", ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Game Buttons
        JButton clicked = (JButton) e.getSource();

        // play button
        if (clicked == buttonPlay) {

            // Genera un numero casuale
            this.random = (int) (Math.random() * 100);
            System.out.println(random);

            // Avvia il gioco
            gameEnable();

            // Resetta i tentativi all'avvio del gioco
            setAttempts(0);

            // Se il tasto è settato a reset, resetta il gioco
            if (buttonPlay.getText() == "RESET") {
                JOptionPane.showMessageDialog(new JFrame(), "Gioco resettato!");
                fieldNumber.setText("");
            }

            // Setta il tasto a reset
            buttonPlay.setText("RESET");

        }

        if (clicked == buttonTry) {

            String tryText =  fieldNumber.getText();

            // Controlla se è stato inserito qualcosa nel textfield
            if (tryText.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Devi inserire qualcosa!");
                return;
            }

            // Controlla se è stato inserito un numero valido
            try {
                tryNumb = Integer.parseInt(tryText);
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(new JFrame(), "Inserimento non valido!");
                return;
            }

            // Controlla se il numero inserito è compreso tra 1 e 100
            if (tryNumb < 0 || tryNumb > 100) {
                JOptionPane.showMessageDialog(new JFrame(), "Il numero deve essere compreso tra 0 e 100!");
                return;
            }

            // ... se tutti i controlli precedenti sono passati

            // Aggiunge un tentativo
            setAttempts(this.attempts + 1);

            // Se i tentativi dell'utente sono uguali a quelli massimi (LOSS)
            if (attempts == maxAttempts) {
                // Mostra il dialogo di perdita
                JOptionPane.showMessageDialog(new JFrame(), "Hai perso!");
                // Resetta i tentativi a 0 (estetico / rindondante: operazione eseguita già nel tasto play)
                setAttempts(0);
                fieldNumber.setText("");
                // Imposta il bottone a GIOCA
                buttonPlay.setText("GIOCA");
                // Disabilita il gioco
                gameDisable();
                // STOP
                return;
            }

            // Se il numero inserito è uguale al numero casuale generato
            if (tryNumb == random) {
                JOptionPane.showMessageDialog(new JFrame(), "Hai vinto!");      // Mostra il dialogo di vittoria
                // Imposta i tentativi a 0
                setAttempts(0);
                // Resetta il field
                fieldNumber.setText("");
                // Imposta il bottone a GIOCA
                buttonPlay.setText("GIOCA");
                // Disabilita il gioco
                gameDisable();
                // STOP
                return;

            // Se il numero inserito è DIVERSO dal numero casuale
            } else {
                // Aggiunge il numero tra quelli tentati precedentemente
                addPastAttempt(tryNumb);
                // Resetta il field
                fieldNumber.setText("");
                // Se il numero è MAGGIORE di quello random
                if (tryNumb > random) {
                    JOptionPane.showMessageDialog(new JFrame(), "Prova con un numero più piccolo!");
                    return;
                // Se il numero è MINORE di quello inserito
                } else if (tryNumb < random) {
                    JOptionPane.showMessageDialog(new JFrame(), "Prova con un numero più grande!");
                    return;
                }
            }

        }

    }
}
