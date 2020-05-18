package venditaabbigliamento;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vendita Abbigliamento
 *
 * Class: Frame
 *
 * @author gbfactory
 * @since 15/05/2020
 */

public class Frame extends JFrame implements ActionListener {

    JPanel datiUtente;
    JPanel tipoAbbigliamento;
    JPanel taglia;
    JPanel tipoManiche;
    JPanel uomoDonna;
    JPanel capuccio;
    JPanel pnlPrezzo;

    // datiutente
    JLabel lblNomeUtente;
    JLabel lblCognomeUtente;
    JTextField tfNomeUtente;
    JTextField tfCognomeUtente;

    // tipoabbigliamento
    JRadioButton rbMaglietta;
    JRadioButton rbFelpa;
    ButtonGroup bgTipoAbb;

    // taglia
    JRadioButton rbTagliaS;
    JRadioButton rbTagliaL;
    JRadioButton rbTagliaXL;
    ButtonGroup bgTaglia;

    // maniche
    JRadioButton rbManicheCorte;
    JRadioButton rbManicheLunghe;
    ButtonGroup bgManiche;

    // uomo donna
    JRadioButton rbUomo;
    JRadioButton rbDonna;
    ButtonGroup bgUomoDonna;

    // cappuccio
    JCheckBox cbCappuccio;
    JCheckBox cbCerniera;
    JCheckBox cbBottoni;

    // prezzo
    JLabel lblPrezzo;

    int przTipo;
    int przTaglia;
    int przManiche;
    int przUomoDonna;
    int przCappuccio;
    int przCerniera;
    int przBottoni;

    int prezzo;

    Frame() {
        super("Vendita Abbigliamento");

        setLayout(new GridLayout(7, 1));

        // Pannello dati utente
        datiUtente = new JPanel();
        datiUtente.setBorder(new TitledBorder("Dati Utente"));

        datiUtente.setLayout(new GridLayout(1, 4));

        lblNomeUtente = new JLabel("Nome utente: ");
        lblCognomeUtente = new JLabel("Cognome utente: ");

        tfNomeUtente = new JTextField();
        tfCognomeUtente = new JTextField();

        datiUtente.add(lblNomeUtente);
        datiUtente.add(tfNomeUtente);
        datiUtente.add(lblCognomeUtente);
        datiUtente.add(tfCognomeUtente);

        add(datiUtente);

        // Pannello tipo abbigliamento
        tipoAbbigliamento = new JPanel();
        tipoAbbigliamento.setBorder(new TitledBorder("Tipo di Abbigliamento"));

        rbMaglietta = new JRadioButton("Maglietta");
        rbFelpa = new JRadioButton("Felpa");

        rbMaglietta.addActionListener(this);
        rbFelpa.addActionListener(this);

        bgTipoAbb = new ButtonGroup();
        bgTipoAbb.add(rbMaglietta);
        bgTipoAbb.add(rbFelpa);

        tipoAbbigliamento.add(rbMaglietta);
        tipoAbbigliamento.add(rbFelpa);

        add(tipoAbbigliamento);

        // Pannello selettore taglia
        taglia = new JPanel();
        taglia.setBorder(new TitledBorder("Selezione Taglia"));

        rbTagliaS = new JRadioButton("S");
        rbTagliaL = new JRadioButton("L");
        rbTagliaXL = new JRadioButton("XL");

        rbTagliaS.addActionListener(this);
        rbTagliaL.addActionListener(this);
        rbTagliaXL.addActionListener(this);

        bgTaglia = new ButtonGroup();
        bgTaglia.add(rbTagliaS);
        bgTaglia.add(rbTagliaL);
        bgTaglia.add(rbTagliaXL);

        taglia.add(rbTagliaS);
        taglia.add(rbTagliaL);
        taglia.add(rbTagliaXL);

        add(taglia);

        // Pannello tipo maniche
        tipoManiche = new JPanel();
        tipoManiche.setBorder(new TitledBorder("Seleziona tipo maniche"));

        rbManicheCorte = new JRadioButton("Corte");
        rbManicheLunghe = new JRadioButton("Lunghe");

        rbManicheCorte.addActionListener(this);
        rbManicheLunghe.addActionListener(this);

        bgManiche = new ButtonGroup();
        bgManiche.add(rbManicheCorte);
        bgManiche.add(rbManicheLunghe);

        tipoManiche.add(rbManicheCorte);
        tipoManiche.add(rbManicheLunghe);

        add(tipoManiche);

        // Pannello selettore uomo/donna
        uomoDonna = new JPanel();
        uomoDonna.setBorder(new TitledBorder("Seleziona Uomo/Donna"));

        rbUomo = new JRadioButton("Uomo");
        rbDonna = new JRadioButton("Donna");

        rbUomo.addActionListener(this);
        rbDonna.addActionListener(this);

        bgUomoDonna = new ButtonGroup();
        bgUomoDonna.add(rbUomo);
        bgUomoDonna.add(rbDonna);

        uomoDonna.add(rbUomo);
        uomoDonna.add(rbDonna);

        add(uomoDonna);

        // cappuccio cerniera bottoni
        capuccio = new JPanel();
        capuccio.setBorder(new TitledBorder("Seleziona Cappuccio/Cerniera/Bottoni"));

        cbCappuccio = new JCheckBox("Cappuccio");
        cbCerniera = new JCheckBox("Cerniera");
        cbBottoni = new JCheckBox("Bottoni");

        cbCappuccio.addActionListener(this);
        cbCerniera.addActionListener(this);
        cbBottoni.addActionListener(this);

        capuccio.add(cbCappuccio);
        capuccio.add(cbCerniera);
        capuccio.add(cbBottoni);

        add(capuccio);

        // Prezzo
        pnlPrezzo = new JPanel();
        pnlPrezzo.setBorder(new TitledBorder("Prezzo"));

        lblPrezzo = new JLabel("Pezzo totale: 0");

        pnlPrezzo.add(lblPrezzo);

        add(pnlPrezzo);

        // Finestea
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void aggiornaPrezzo() {
        prezzo = przTipo + przTaglia + przManiche + przUomoDonna + przCappuccio + przCerniera + przBottoni;
        lblPrezzo.setText("Prezzo totale: " + prezzo);
    }

    public void actionPerformed(ActionEvent e) {

        // gestisce radiobutton
        if (e.getSource() instanceof JRadioButton) {
            JRadioButton rbClicked = (JRadioButton) e.getSource();

            if (rbClicked == rbMaglietta) {
                przTipo = 10;
            } else if (rbClicked == rbFelpa) {
                przTipo = 20;
            } else if (rbClicked == rbTagliaS) {
                przTaglia = 5;
            } else if (rbClicked == rbTagliaL) {
                przTaglia = 10;
            } else if (rbClicked == rbTagliaXL) {
                przTaglia = 15;
            } else if (rbClicked == rbManicheCorte) {
                przManiche = 3;
            } else if (rbClicked == rbManicheLunghe) {
                przManiche = 6;
            } else if (rbClicked == rbUomo) {
                przUomoDonna = 2;
            } else if (rbClicked == rbDonna) {
                przUomoDonna = 1;
            }
        }

        // gestisce checkbox
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox cbClicked = (JCheckBox) e.getSource();

            if (cbClicked == cbCappuccio) {
                if (cbCappuccio.isSelected()) {
                    przCappuccio = 5;
                } else {
                    przCappuccio = 0;
                }
            } else if (cbClicked == cbBottoni) {
                if (cbBottoni.isSelected()) {
                    przBottoni = 3;
                } else {
                    przBottoni = 0;
                }
            } else if (cbClicked == cbCerniera) {
                if (cbCerniera.isSelected()) {
                    przCerniera = 4;
                } else {
                    przCerniera = 0;
                }
            }
        }

        // aggiorna prezzo
        aggiornaPrezzo();
    }

}
