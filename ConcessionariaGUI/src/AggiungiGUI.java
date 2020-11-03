// Concessionaria by gb factory - 03/11/2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AggiungiGUI extends JFrame {

    JLabel lbMarca, lbModello, lbCilindrata, lbPotenza, lbCategoria, lbNumeroPosti, lbNumeroPorte, lbTarga;
    JTextField tfMarca, tfModello, tfCilindrata, tfPotenza, tfCategoria, tfNumeroPosti, tfNumeroPorte, tfTarga;
    JButton btnAggiungi;
    JPanel pnFields = new JPanel();

    AggiungiGUI() {
        super("Aggiungi Automobile");

        setLayout(new BorderLayout());

        pnFields.setLayout(new GridLayout(8,2));

        lbMarca = new JLabel("Marca");
        pnFields.add(lbMarca);

        tfMarca = new JTextField();
        pnFields.add(tfMarca);

        lbModello = new JLabel("Modello");
        pnFields.add(lbModello);

        tfModello = new JTextField();
        pnFields.add(tfModello);

        lbCilindrata = new JLabel("Cilindrata");
        pnFields.add(lbCilindrata);

        tfCilindrata = new JTextField();
        pnFields.add(tfCilindrata);

        lbPotenza = new JLabel("Potenza");
        pnFields.add(lbPotenza);

        tfPotenza = new JTextField();
        pnFields.add(tfPotenza);

        lbCategoria = new JLabel("Categoria Euro");
        pnFields.add(lbCategoria);

        tfCategoria = new JTextField();
        pnFields.add(tfCategoria);

        lbNumeroPosti = new JLabel("Numero Posti");
        pnFields.add(lbNumeroPosti);

        tfNumeroPosti = new JTextField();
        pnFields.add(tfNumeroPosti);

        lbNumeroPorte = new JLabel("Numero Porte");
        pnFields.add(lbNumeroPorte);

        tfNumeroPorte = new JTextField();
        pnFields.add(tfNumeroPorte);

        lbTarga = new JLabel("Targa");
        pnFields.add(lbTarga);

        tfTarga = new JTextField();
        pnFields.add(tfTarga);

        add(pnFields, BorderLayout.CENTER);

        btnAggiungi = new JButton("Aggiungi Automobile");

        add(btnAggiungi, BorderLayout.PAGE_END);

        setSize(300, 300);
        setVisible(true);
        setResizable(false);

        btnAggiungi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String marca = tfMarca.getText();
                String modello = tfModello.getText();
                String targa = tfMarca.getText();
                String strCilindrata = tfCilindrata.getText();
                String strPotenza = tfPotenza.getText();
                String strCategoria = tfCategoria.getText();
                String strNumeroPosti = tfNumeroPosti.getText();
                String strNumeroPorte = tfNumeroPorte.getText();

                if (marca == null || marca.isEmpty()) { showError("Devi inserire una marca!"); return; }
                if (modello == null || modello.isEmpty()) { showError("Devi inserire un modello!"); return; }
                if (targa == null || targa.isEmpty()) { showError("Devi inserire una targa!"); return; }
                if (targa.length() != 7) { showError("Devi inserire una targa nel formato ##@@@##!"); return; }
                if (strCilindrata == null || strCilindrata.isEmpty()) { showError("Devi inserire la cilindrata!"); return; }
                if (strPotenza == null || strPotenza.isEmpty()) { showError("Devi inserire la potenza!"); return; }
                if (strCategoria == null || strCategoria.isEmpty()) { showError("Devi inserire la categoria euro!"); return; }
                if (strNumeroPosti == null || strNumeroPosti.isEmpty()) { showError("Devi inserire il numero di posti!"); return; }
                if (strNumeroPorte == null || strNumeroPorte.isEmpty()) { showError("Devi inserire il numero di porte!"); return; }

                if (!isNumeric(tfCilindrata.getText())) { showError("La cilindrata deve essere un numero!"); return; }
                if (!isNumeric(tfPotenza.getText())) { showError("La potenza deve essere un numero!"); return; }
                if (!isNumeric(tfCategoria.getText())) { showError("La categoria deve essere un numero!"); return; }
                if (!isNumeric(tfNumeroPosti.getText())) { showError("Il numero dei posti deve essere un numero!"); return; }
                if (!isNumeric(tfNumeroPorte.getText())) { showError("Il numero delle porte deve essere un numero!"); return; }

                int cilindrata = Integer.parseInt(strCilindrata);
                int potenza = Integer.parseInt(strPotenza);
                int categoria = Integer.parseInt(strCategoria);
                int numeroPosti = Integer.parseInt(strNumeroPosti);
                int numeroPorte = Integer.parseInt(strNumeroPorte);

                // esecuzione
                String auto = marca + ";" + modello + ";" + cilindrata + ";" + potenza + ";" + categoria + ";" + numeroPosti + ";" + numeroPorte  + ";" + targa + ";false\n";

                System.out.println(auto);

                File concessionaria = new File("concessionaria.csv");

                if (concessionaria.exists()) {
                    writeFile(concessionaria, auto);
                    setVisible(false);
                    dispose();
                    showInfo("L'auto è stata salvata con successo!");
                } else {
                    try {
                        concessionaria.createNewFile();
                        writeFile(concessionaria, auto);
                        setVisible(false);
                        dispose();
                        showInfo("Il file è stato creato e l'auto è stata salvata");
                    } catch (IOException ioException) {
                        showError("Errore durante la creazione del file.");
                    }
                }

            }
        });

    }

    private void showInfo(String info) {
        JOptionPane optionPane = new JOptionPane(info);
        JDialog dialog = optionPane.createDialog("Info!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        return;
    }

    private void showError(String error) {
        JOptionPane optionPane = new JOptionPane(error, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Errore!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        return;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void writeFile(File file, String data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.append(data);
            bw.close();
        } catch (IOException er) {
            showError("Errore durante la scrittura su file.");
        }
    }

}
