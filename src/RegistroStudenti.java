/*Snack 3: Registro Studenti
Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente (creati nello Snack 1). Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti, senza utilizzare metodi helper.*/


/* public class RegistroStudenti {
        //array privato per memorizzare gli oggetti Studente
    private Studente[] studenti;

        //costruttore senza parametri per inizializzare il registro vuoto
    public RegistroStudenti(){
    studenti = new Studente[0];
    }

        //metodo publico per aggiungere studenti al registro
    public void aggiungiStudente(Studente nuovo){
        Studente[] temp = new Studente[studenti.length + 1];
        for(int i = 0; i < studenti.length; i++){
            temp[i] = studenti[i];
        }
        temp[studenti.length] = nuovo;
        studenti = temp;
    }    
        //metodo che stampa la lista degli studenti
    public void stampaStudenti() {
        for(int i = 0; i < studenti.length;i++){
            System.out.println(studenti[i].concatenaValori());
        }
    }

} */


//CORREZIONE

public class RegistroStudenti {

    private Studente[] registro;

    public RegistroStudenti(){
        this.registro = new Studente[0];
    }

    public Studente[] getRegistro(){
        return this.registro;
    }

    public void setRegistro(Studente[] registro){
        this.registro = registro;
    }

    public void addStudente(Studente studente){
        //creo un nuovo registro lungo come quello di prima + 1
        Studente[] registroAggiornato = new Studente[this.registro.length + 1];

        //copio il mio vecchio registro nel nuovo, studente per studente
        for(int i = 0; i < this.registro.length; i++){
            registroAggiornato[i] = this.registro[i];
        }

        // aggiungo alla fine del array l'ultimo studente
        registroAggiornato[registroAggiornato.length - 1] = studente;

        //sovrascrivo il vecchio registro con quello nuovo
        this.registro = registroAggiornato;
    }

    @Override
    public String toString(){
        String output = "Registro studenti: ";
        for (Studente studente : this.registro){
            output += String.format(" %s;", studente.getInfoStudente());
        }
        return output;
    }
    
}

