package abbigliamentoread;

public class Ordine {

    private String nome;
    private String cognome;
    private int przTipo;
    private int przTaglia;
    private int przManiche;
    private int przUomoDonna;
    private int przCappuccio;
    private int przCerniera;
    private int przBottoni;

    public Ordine(String nome, String cognome, String tipo, String taglia, String maniche, String ud, String cappuccio, String cerniera, String bottoni) {
        this.nome = nome;
        this.cognome = cognome;
        przTipo = Integer.parseInt(tipo);
        przTaglia = Integer.parseInt(taglia);
        przManiche = Integer.parseInt(maniche);
        przUomoDonna = Integer.parseInt(ud);
        przCappuccio = Integer.parseInt(cappuccio);
        przCerniera = Integer.parseInt(cerniera);
        przBottoni = Integer.parseInt(bottoni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getPrzTipo() {
        return przTipo;
    }

    public void setPrzTipo(int przTipo) {
        this.przTipo = przTipo;
    }

    public String getPrzTaglia() {
        if (przTaglia == 5) {
            return "S";
        } else if (przTaglia == 10) {
            return "L";
        } else if (przTaglia == 15) {
            return "XL";
        } else {
            return "ERROR";
        }
    }

    public void setPrzTaglia(int przTaglia) {
        this.przTaglia = przTaglia;
    }

    public String getPrzManiche() {
        if (przManiche == 3) {
            return "Maniche corte";
        } else if (przManiche == 6) {
            return "Maniche lunghe";
        } else {
            return "ERROR";
        }
    }

    public void setPrzManiche(int przManiche) {
        this.przManiche = przManiche;
    }

    public String getPrzUomoDonna() {
        if (przUomoDonna == 2) {
            return "Uomo";
        } else if (przUomoDonna == 1) {
            return "Donna";
        } else {
            return "ERROR";
        }
    }

    public void setPrzUomoDonna(int przUomoDonna) {
        this.przUomoDonna = przUomoDonna;
    }

    public String getPrzCappuccio() {
        if (przCappuccio == 5) {
            return "Si cappuccio";
        } else {
            return "No cappuccio";
        }
    }

    public void setPrzCappuccio(int przCappuccio) {
        this.przCappuccio = przCappuccio;
    }

    public String getPrzCerniera() {
        if (przCerniera == 4) {
            return "Si cerniera";
        } else {
            return "No cerniera";
        }
    }

    public void setPrzCerniera(int przCerniera) {
        this.przCerniera = przCerniera;
    }

    public String getPrzBottoni() {
        if (przBottoni == 3) {
            return "Si bottoni";
        } else {
            return "No bottoni";
        }
    }

    public void setPrzBottoni(int przBottoni) {
        this.przBottoni = przBottoni;
    }
}
