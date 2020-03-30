/**
 * Classe Alunno Serializable
 *
 * @author gbfactory
 * @since 30.03.2020
 */

package AlunnoSerializable;

import java.io.Serializable;

public class Alunno implements Serializable {

    private static final long serialVersionUID = 1L;

    String cognome;
    String nome;
    int annoNascita;

    public Alunno() {

    }

    public Alunno(String cognome, String nome, int annoNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    @Override
    public String toString() {
        return "Alunno{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", annoNascita=" + annoNascita +
                '}';
    }

}
