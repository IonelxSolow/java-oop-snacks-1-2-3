/* Snack 1: Studente
Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni). */


/* public class Studente {
    String nome;
    String cognome;
    int eta;

        Studente(String nome, String cognome, int eta){
            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
        }

        public String concatenaValori(){
            return nome + " " + cognome + ", " + eta + " " + "anni";
        }

} */


//CORREZIONE

public class Studente {

        String nome;
        String cognome;
        int eta;


    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
        
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
         this.nome = nome;
    }
    
    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getInfoStudente(){
        return String.format("%s %s, %d", this.nome, this.cognome, this.eta);
    }

    /* @Override
    public String toString(){
        return String.format("%s %s, %d", this.nome, this.cognome, this.eta);
    } */
}