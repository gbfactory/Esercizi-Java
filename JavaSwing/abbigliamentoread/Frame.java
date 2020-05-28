package abbigliamentoread;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Frame extends JFrame {

    JPanel pnldatiUtente;
    JPanel pnlDatiAbb;
    JPanel pnlNav;

    private JLabel nome;
    private JLabel cognome;
    private JLabel tipo;
    private JLabel taglia;
    private JLabel maniche;
    private JLabel uomodonna;
    private JLabel cappuccio;
    private JLabel cerniera;
    private JLabel bottoni;

    private JButton btnNext;
    private JButton btnPrev;

    private int maxLen = 0;

    private int nowCounter = 0;

    private ArrayList<Ordine> listaOrdini;

    public Frame() {

        super("Visualizza Ordini Abbigliamento");

        listaOrdini = new ArrayList<Ordine>();

        try {
            Scanner fileScanner = new Scanner(new File("./src/abbigliamentowrite/ordini.txt"));
            fileScanner.useDelimiter("\r\n");
            while(fileScanner.hasNext()) {
                String[] dati = fileScanner.nextLine().split(";");
                listaOrdini.add(new Ordine(dati[0], dati[1], dati[2], dati[3], dati[4], dati[5], dati[6], dati[7], dati[8]));
            }
            fileScanner.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        setLayout(new GridLayout(7, 1));

        maxLen = listaOrdini.size();

        // pannello nav
        pnlNav = new JPanel();
        pnlNav.setBorder(new TitledBorder("Navigatore Ordini"));
        pnlNav.setLayout(new GridLayout(1, 2));

        btnPrev = new JButton("<<<");
        btnNext = new JButton(">>>");

        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nowCounter == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Attenzione!", "Non puoi andare indietro!", JOptionPane.WARNING_MESSAGE);
                } else {
                    nowCounter -= 1;
                    aggiorna();
                }
            }
        });

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nowCounter == maxLen - 1) {
                    JOptionPane.showMessageDialog(new JFrame(), "Attenzione!", "Non puoi andare avanti", JOptionPane.WARNING_MESSAGE);
                } else {
                    nowCounter += 1;
                    aggiorna();
                }
            }
        });

        pnlNav.add(btnPrev);
        pnlNav.add(btnNext);

        add(pnlNav);


        // VISUALIZZA DATI
        Ordine o = listaOrdini.get(nowCounter);

        // Pannello dati utente
        pnldatiUtente = new JPanel();
        pnldatiUtente.setBorder(new TitledBorder("Dati Utente"));
        pnldatiUtente.setLayout(new GridLayout(1, 2));

        nome = new JLabel("Nome: " + o.getNome());
        cognome = new JLabel("Cognome: " + o.getCognome());

        pnldatiUtente.add(nome);
        pnldatiUtente.add(cognome);

        add(pnldatiUtente);

        // pannello dati
        pnlDatiAbb = new JPanel();
        pnlDatiAbb.setBorder(new TitledBorder("Dati capo d'abbigliamento"));

        tipo = new JLabel("Tipo: " + o.getPrzTipo());
        taglia = new JLabel(" - Taglia: " + o.getPrzTaglia());
        maniche = new JLabel(" - Maniche: " + o.getPrzTaglia());
        uomodonna = new JLabel(" - Uomo donna: " + o.getPrzUomoDonna());
        cappuccio = new JLabel(" - Cappuccio: " + o.getPrzCappuccio());
        cerniera = new JLabel(" - Cerniera: " + o.getPrzCerniera());
        bottoni = new JLabel(" - Bottoni: " + o.getPrzBottoni());

        pnlDatiAbb.add(tipo);
        pnlDatiAbb.add(taglia);
        pnlDatiAbb.add(maniche);
        pnlDatiAbb.add(uomodonna);
        pnlDatiAbb.add(cappuccio);
        pnlDatiAbb.add(cerniera);
        pnlDatiAbb.add(bottoni);

        add(pnlDatiAbb);

        // Finestea
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void aggiorna() {

        Ordine o = listaOrdini.get(nowCounter);

        nome.setText("Nome: " + o.getNome());
        cognome.setText("Cognome: " + o.getCognome());

        tipo.setText("Tipo: " + o.getPrzTipo());
        taglia.setText(" - Taglia: " + o.getPrzTaglia());
        maniche.setText(" - Maniche: " + o.getPrzTaglia());
        uomodonna.setText(" - Uomo donna: " + o.getPrzUomoDonna());
        cappuccio.setText(" - Cappuccio: " + o.getPrzCappuccio());
        cerniera.setText(" - Cerniera: " + o.getPrzCerniera());
        bottoni.setText(" - Bottoni: " + o.getPrzBottoni());


    }


}
