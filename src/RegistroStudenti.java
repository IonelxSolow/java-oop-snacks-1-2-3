/*Snack 3: Registro Studenti
Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente (creati nello Snack 1). Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti, senza utilizzare metodi helper.*/


public class RegistroStudenti {
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

}

