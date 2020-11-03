// Concessionaria by gb factory - 03/11/2020

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ElencoGUI extends JFrame {

    ElencoGUI() {
        super("Visualizza Concessionaria");

        String col[] = { "Marca", "Modello", "Cilindrata", "Potenza", "Categoria", "N Posti", "N Porte", "Targa", "Venduto" };

        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        ArrayList<String[]> dataFromFile = new ArrayList<String[]>();

        try {
            Scanner fileScanner = new Scanner(new File("concessionaria.csv"));
            fileScanner.useDelimiter("\r\n");
            while(fileScanner.hasNext()) {
                String[] dati = fileScanner.nextLine().split(";");
                dataFromFile.add(dati);
            }
            fileScanner.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        for (String[] s : dataFromFile) {
            String marca = s[0];
            String modello = s[1];
            String cilindrata = s[2];
            String potenza = s[3];
            String categoria = s[4];
            String numeroPosti = s[5];
            String numeroPorte = s[6];
            String targa = s[7];
            String venduto = s[8];

            Object[] data = { marca, modello, cilindrata, potenza, categoria, numeroPosti, numeroPorte, targa, venduto };

            tableModel.addRow(data);
        }

        JTable table = new JTable(tableModel);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
                    ArrayList<String> rowData = new ArrayList<String>();

                    for (int i = 0; i < table.getColumnCount(); i++) {
                        rowData.add(table.getValueAt(table.getSelectedRow(),i).toString());
                    }

                    String marca = rowData.get(0);
                    String modello = rowData.get(1);
                    int cilindrata = Integer.parseInt(rowData.get(2));
                    int potenza = Integer.parseInt(rowData.get(3));
                    int categoria = Integer.parseInt(rowData.get(4));
                    int numeroPosti = Integer.parseInt(rowData.get(5));
                    int numeroPorte = Integer.parseInt(rowData.get(6));
                    String targa = rowData.get(7);
                    boolean venduto = Boolean.parseBoolean(rowData.get(8));

                    Auto auto = new Auto(marca, modello, cilindrata, potenza, categoria, numeroPosti, numeroPorte, targa, venduto);

                    if (auto.getVenduto()) System.out.println("Non puoi modificare un'auto già venduta!");
                    else new AutoGUI(auto);

                    setVisible(false);
                    dispose();
                }
            }

        });

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());

        table.setRowSorter(rowSorter);

        JTextField ricerca = new JTextField();

        setSize(700, 700);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(ricerca, BorderLayout.SOUTH);

        ricerca.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = ricerca.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = ricerca.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Errore");
            }
        });

    }
}
