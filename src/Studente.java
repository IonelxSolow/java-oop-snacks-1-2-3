/* Snack 1: Studente
Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni). */


public class Studente {
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

}
