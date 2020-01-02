package programmi;

import java.io.File;
import java.util.Scanner;

public class CodiceFiscale {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cognome = "";
        String nome = "";
        String sesso = "";
        //String comune = "";
        String provincia = "";
        int dataGiorno = 0;
        String dataGiornoString = "";
        int dataMese = 0;
        String dataMeseCode = "";
        int dataAnno = 0;
        String dataAnnoString = "";

        String cfPre = "";

        // ===============================================================
        // cognome input
        System.out.println("Inserisci cognome");
        cognome = scan.nextLine();

        // CODICE COGNOME
        cognome = cognome.toUpperCase();
        String cCons = "";
        String cVocs = "";

        for (int i = 0; i < cognome.length(); i++) {

            char c = cognome.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                if (cVocs.length() < 3) {
                    cVocs += c;
                }
            } else {
                cCons += c;
                if (cCons.length() == 3) {
                    cVocs = "";
                    break;
                }
            }
        }

        if (cCons.length() < 3) {
            if (cCons.length() == 2) {
                cCons += cVocs.charAt(0);
            }
            if (cCons.length() == 1) {
                if (cVocs.length() > 1) {
                    cCons += cVocs.charAt(0) + cVocs.charAt(1);
                } else {
                    cCons += cVocs.charAt(0) + "X";
                }
            }
            if (cCons.length() == 0) {
                if (cVocs.length() < 3) {
                    cCons = cVocs + "X";
                } else {
                    cCons = cVocs;
                }
            }
        }

        cfPre += cCons;

        // ===============================================================
        // nome input
        System.out.println("Inserisci nome");
        nome = scan.nextLine();

        // CODICE NOME
        nome = nome.toUpperCase();
        String vCons = "";
        String nVocs = "";

        for (int i = 0; i < nome.length(); i++) {

            char c = nome.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                if (nVocs.length() < 3) {
                    nVocs += c;
                }
            } else {
                vCons += c;
                if (vCons.length() == 4) {
                    nVocs = "";
                    break;
                }
            }
        }

        if (vCons.length() < 3) {
            if (vCons.length() == 2) {
                vCons += nVocs.charAt(0);
            }
            if (vCons.length() == 1) {
                if (nVocs.length() > 1) {
                    vCons += nVocs.charAt(0) + nVocs.charAt(1);
                } else {
                    vCons += nVocs.charAt(0) + "X";
                }
            }
            if (vCons.length() == 0) {
                if (nVocs.length() < 3) {
                    vCons = nVocs + "X";
                } else {
                    vCons = nVocs;
                }
            }
        }

        if (vCons.length() > 3) {
            String temp = vCons;
            vCons = "";
            vCons += Character.toString(temp.charAt(0)) + Character.toString(temp.charAt(2)) + Character.toString(temp.charAt(3));
        }

        cfPre += vCons;

        // ===============================================================
        // SESSO
        System.out.println("Inserisci il sesso (M o F)");
        sesso = scan.nextLine();

        // ===============================================================
        // ANNO
        System.out.println("Inserisci anno di nascita");
        dataAnno = scan.nextInt();

        dataAnno = dataAnno % 100;

        if (dataAnno <= 9) {
            dataAnnoString = "0" + dataAnno;
        } else {
            dataAnnoString = dataAnno + "";
        }

        cfPre += dataAnnoString;

        // ===============================================================
        // MESE
        System.out.println("Inserisci mese di nascita");
        dataMese = scan.nextInt();

        switch (dataMese) {
            case 1: dataMeseCode = "A"; break;
            case 2: dataMeseCode = "B"; break;
            case 3: dataMeseCode = "C"; break;
            case 4: dataMeseCode = "D"; break;
            case 5: dataMeseCode = "E"; break;
            case 6: dataMeseCode = "H"; break;
            case 7: dataMeseCode = "L"; break;
            case 8: dataMeseCode = "M"; break;
            case 9: dataMeseCode = "P"; break;
            case 10: dataMeseCode = "R"; break;
            case 11: dataMeseCode = "S"; break;
            case 12: dataMeseCode = "T"; break;
        }

        cfPre += dataMeseCode;

        // ===============================================================
        // GIORNO
        System.out.println("Inserisci giorno di nascita");
        dataGiorno = scan.nextInt();

        if (sesso.equalsIgnoreCase("F")) {
            dataGiorno += 40;
        }

        if (dataGiorno <= 9) {
            dataGiornoString = "0" + dataGiorno;
        } else {
            dataGiornoString = dataGiorno + "";
        }

        cfPre += dataGiornoString;

        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        scan.nextLine();
        // fine fix carattere \n

        // ===============================================================
        // CODICE CATASTALE
        System.out.println("Inserisci il comune");
        String comune = scan.nextLine();

        String codCat="";
        try {
            Scanner fileScanner = new Scanner(new File("comuni.txt"));
            fileScanner.useDelimiter("\r\n");
            while(fileScanner.hasNext()) {
                String s1 = fileScanner.nextLine();
                String s2 = s1.substring(0,s1.indexOf('-')-1);
                if(s2.equalsIgnoreCase(comune)) {
                    codCat = s1.substring(s1.lastIndexOf(' ')+1);
                    break;
                }
            }
            fileScanner.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        cfPre += codCat;

        //System.out.println(cfPre);
        // ===============================================================
        // CARATTERE DI CONTROLLO

        // caratteri pari
        String pari = "";
        for (int i = 0; i < cfPre.length(); i++) {
            if((i + 1) % 2 == 0) {
                pari += Character.toString(cfPre.charAt(i));
            }
        }

        // caratteri dispari
        String dispari = "";
        for (int i = 0; i < cfPre.length(); i++) {
            if ((i + 1) % 2 == 1) {
                dispari += Character.toString(cfPre.charAt(i));
            }
        }

        // conversione valori dispari
        int rDispari = 0;

        for (int i = 0; i < dispari.length(); i++) {
            char c = dispari.charAt(i);
            switch (c) {
                case '0':
                case 'A':
                    rDispari += 1;
                    break;
                case '1':
                case 'B':
                    rDispari += 0;
                    break;
                case '2':
                case 'C':
                    rDispari += 5;
                    break;
                case '3':
                case 'D':
                    rDispari += 7;
                    break;
                case '4':
                case 'E':
                    rDispari += 9;
                    break;
                case '5':
                case 'F':
                    rDispari += 13;
                    break;
                case '6':
                case 'G':
                    rDispari += 15;
                    break;
                case '7':
                case 'H':
                    rDispari += 17;
                    break;
                case '8':
                case 'I':
                    rDispari += 19;
                    break;
                case '9':
                case 'J':
                    rDispari += 21;
                    break;
                case 'K':
                    rDispari += 2;
                    break;
                case 'L':
                    rDispari += 4;
                    break;
                case 'M':
                    rDispari += 18;
                    break;
                case 'N':
                    rDispari += 20;
                    break;
                case 'O':
                    rDispari += 11;
                    break;
                case 'P':
                    rDispari += 3;
                    break;
                case 'Q':
                    rDispari += 6;
                    break;
                case 'R':
                    rDispari += 8;
                    break;
                case 'S':
                    rDispari += 12;
                    break;
                case 'T':
                    rDispari += 14;
                    break;
                case 'U':
                    rDispari += 16;
                    break;
                case 'V':
                    rDispari += 10;
                    break;
                case 'W':
                    rDispari += 22;
                    break;
                case 'X':
                    rDispari += 25;
                    break;
                case 'Y':
                    rDispari += 24;
                    break;
                case 'Z':
                    rDispari += 23;
                    break;
            }
        }

        // conversione valori pari
        int rPari = 0;

        for (int i = 0; i < pari.length(); i++) {
            char c = pari.charAt(i);
            int n = Character.getNumericValue(c);

            if (Character.isLetter(c)) {
                n = c - 65;
                rPari += n;
            } else {
                rPari += n;
            }
        }

        // somma
        int somma = rDispari + rPari;
        int resto = (int) somma % 26;
        char restoConv = (char) (resto + 65);
        cfPre += Character.toString(restoConv);

        System.out.println(cfPre);

    }

}
