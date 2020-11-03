// Concessionaria by gb factory - 03/11/2020

public class Auto {

    private String marca = "";
    private String modello = "";
    private int cilindrata = 0;
    private int potenza = 0;
    private int categoria = 0;
    private int numeroPosti = 0;
    private int numeroPorte = 0;
    private String targa = "";
    boolean venduto = false;

    Auto() {
        this.marca = "";
        this.modello = "";
        this.cilindrata = 0;
        this.potenza = 0;
        this.categoria = 0;
        this.numeroPosti = 0;
        this.numeroPorte = 0;
        this.targa = "";
        this.venduto = false;
    }

    Auto(String marca, String modello, int cilindrata, int potenza, int catEuro, int numeroPosti, int numeroPorte, String targa, boolean venduto) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.potenza = potenza;
        this.categoria = catEuro;
        this.numeroPosti = numeroPosti;
        this.numeroPorte = numeroPorte;
        this.targa = targa;
        this.venduto = venduto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getPotenza() {
        return potenza;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public String getTarga() {
        return targa;
    }

    public boolean getVenduto() {
        return venduto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setVenduto(boolean venduto) {
        this.venduto = venduto;
    }

    public String toString() {
        return getMarca() + ";" + getModello() + ";" + getCilindrata() + ";" + getPotenza() + ";" + getCategoria() + ";" + getNumeroPosti() + ";" + getNumeroPorte() + ";" + getTarga() + ";" + getVenduto();
    }

}