// Concessionaria by gb factory - 03/11/2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

public class AutoGUI extends JFrame {

    JLabel lbMarca, lbModello, lbCilindrata, lbPotenza, lbCategoria, lbNumeroPosti, lbNumeroPorte, lbTarga;
    JTextField tfMarca, tfModello, tfCilindrata, tfPotenza, tfCategoria, tfNumeroPosti, tfNumeroPorte, tfTarga;
    JButton btnSalva;
    JCheckBox cbVendi;
    boolean soldCar = false;

    AutoGUI(Auto auto) {
        super("Modifica Automobile");

        System.out.println(auto.toString());

        setLayout(new GridLayout(9,2));

        lbMarca = new JLabel("Marca");
        add(lbMarca);

        tfMarca = new JTextField(auto.getMarca());
        add(tfMarca);

        lbModello = new JLabel("Modello");
        add(lbModello);

        tfModello = new JTextField(auto.getModello());
        add(tfModello);

        lbCilindrata = new JLabel("Cilindrata");
        add(lbCilindrata);

        tfCilindrata = new JTextField(auto.getCilindrata() + "");
        add(tfCilindrata);

        lbPotenza = new JLabel("Potenza");
        add(lbPotenza);

        tfPotenza = new JTextField(auto.getPotenza() + "");
        add(tfPotenza);

        lbCategoria = new JLabel("Categoria Euro");
        add(lbCategoria);

        tfCategoria = new JTextField(auto.getCategoria() + "");
        add(tfCategoria);

        lbNumeroPosti = new JLabel("Numero Posti");
        add(lbNumeroPosti);

        tfNumeroPosti = new JTextField(auto.getNumeroPosti() + "");
        add(tfNumeroPosti);

        lbNumeroPorte = new JLabel("Numero Porte");
        add(lbNumeroPorte);

        tfNumeroPorte = new JTextField(auto.getNumeroPorte() + "");
        add(tfNumeroPorte);

        lbTarga = new JLabel("Targa");
        add(lbTarga);

        tfTarga = new JTextField(auto.getTarga());
        add(tfTarga);

        // vendi
        cbVendi = new JCheckBox("Vendi");

        cbVendi.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                soldCar = e.getStateChange() == 1 ? true : false;
            }
        });

        add(cbVendi);

        // btn
        btnSalva = new JButton("Salva");
        btnSalva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAuto(auto, newAuto());
            }
        });
        add(btnSalva);

        setSize(375, 340);
        setVisible(true);
        setResizable(false);
    }

    private Auto newAuto() {
        String marca = tfMarca.getText();
        String modello = tfModello.getText();
        int cilindrata = Integer.parseInt(tfCilindrata.getText());
        int potenza = Integer.parseInt(tfPotenza.getText());
        int categoria = Integer.parseInt(tfCategoria.getText());
        int numeroPosti = Integer.parseInt(tfNumeroPosti.getText());
        int numeroPorte = Integer.parseInt(tfNumeroPorte.getText());
        String targa = tfTarga.getText();
        boolean venduto = soldCar;

        Auto auto = new Auto(marca, modello, cilindrata, potenza, categoria, numeroPosti, numeroPorte, targa, venduto);

        return auto;
    }

    private void saveAuto(Auto paramOldAuto, Auto paramNewAuto) {
        String oldAuto = paramOldAuto.toString();
        String newAuto = paramNewAuto.toString();

        File file = new File("concessionaria.csv");
        String oldLista = "";
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                oldLista += line + System.lineSeparator();
                line = reader.readLine();
            }
            String newLista = oldLista.replaceAll(oldAuto, newAuto);
            writer = new FileWriter(file);
            writer.write(newLista);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        new ElencoGUI();
        setVisible(false);
        dispose();

        JOptionPane optionPane = new JOptionPane("L'auto è stata modificata con successo!", JOptionPane.WARNING_MESSAGE);
        JDialog dialog = optionPane.createDialog("Info!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
